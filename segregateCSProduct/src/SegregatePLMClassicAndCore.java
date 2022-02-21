

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class SegregatePLMClassicAndCore {
	
	String wsurl=" https://rsb.internal.ericsson.com/REST/G3/CICD/Product/xs/";
	
	String folderName="Feb09";
	String fileName="Feb09";
	String fileSep = File.separator;
	String commacsvSeparator = ",";
	
	String Username = "V1FDILP";
	String Password = "uIO8ZNnH1y4qSK5MxNZLIMxa";
	
	//String rootPath = "C:\\ericsson\\commercialstructures\\";
	String rootPath = "mnt/sdb/plm/dil/dilsec01";
	//String path=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+".csv";
	//String outputpath=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+"outputFile.csv";
	
	String path=rootPath+fileSep+"dm"+fileSep+"inputfiles"+fileSep+folderName+fileSep+"P_C_ProductExtract"+".csv";
	String outputpath=rootPath+fileSep+"dm"+fileSep+"outputfiles"+fileSep+folderName+fileSep+fileName+"outputFile.csv";
	
	public static void main(String[] args) throws Exception {
		SegregatePLMClassicAndCore segregatePLMClassicAndCore=new SegregatePLMClassicAndCore();
		PrintStream o = new PrintStream(new File("extract.log"));
		   // Assign o to output stream
		 System.setOut(o);
		segregatePLMClassicAndCore.ExtractCSProduct();
	}
	
	public void ExtractCSProduct() throws Exception
	{	
		ArrayList<String> outputProductList=new ArrayList<String>();
		ArrayList<String> productList=readFile();
		productList.remove(0);
		int length=productList.size();
		System.out.println(length);
		int i=0;
		for(String product:productList)
		{
			String data[]=product.split(",");
			System.out.println(i+" "+data[0]+" "+data[data.length-1]);
			//if(data[1].trim().equals("-"))
				//data[1]="HighestRState";
			String sourcetype=webserviceUrl(data[0].trim(),data[data.length-1].trim());
			outputProductList.add(data[0].trim()+commacsvSeparator+data[data.length-1].trim()+commacsvSeparator+sourcetype);
			i++;
		}
		
		writeInfoOutputFile(outputProductList);
	}
	
	public ArrayList<String> readFile() throws Exception {
		String strData = "";
		ArrayList<String> csvproductNumberList = new ArrayList<String>();
		try {
			java.io.File file = new java.io.File(path);

			BufferedReader fileReader = new BufferedReader(new FileReader(file));

			while ((strData = fileReader.readLine()) != null) {
				csvproductNumberList.add(strData);
			} // end while
			
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("\n Error in reading files :" + e);
			e.printStackTrace();
		}

		return csvproductNumberList;
	}
	
	public String webserviceUrl(String productNumber,String productRevision) throws Exception 
	{
		String value = "";
		try {
			
			String authString = Username.trim() + ":" + Password.trim();
		    String authStringEnc = "Basic " + new String(Base64.getEncoder().encode(authString.getBytes()));
		    
		    String productNumber_InURL="";
		    String productRevision_InURL="";
		    
		    try {
		    	productNumber_InURL = URLEncoder.encode(productNumber,"UTF-8").replace("+", "%20");
		    	productRevision_InURL = URLEncoder.encode(productRevision,"UTF-8").replace("+", "%20");
		    }catch(UnsupportedEncodingException e)
		    {
		    	e.printStackTrace();
		    }
		    String webserviceurl=wsurl+productNumber_InURL+"/"+productRevision_InURL+"?CoreData&LifeCycleData";
		    System.out.println(webserviceurl);
		    URL myurl = new URL(webserviceurl);
		    String reqMethod= "GET";
		    
		    HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
		    con.setDoOutput(true);
	        con.setDoInput(true);
	        con.setUseCaches(false);
	        //con.setRequestProperty("Content-type","text/xml");
	        con.setRequestProperty("Content-type","application/x-www-form-urlencoded");        
	        con.setRequestProperty ("Authorization", authStringEnc);
	        con.setRequestMethod(reqMethod);
			
	        String XMLRecord=null;
	        String line = null;
	        int responscode = con.getResponseCode();
	        
	        //System.out.println(responscode);
	        
	        if(responscode == 200)
	        {
	        	InputStream in =con.getInputStream();
	        	
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(in));
	        	
	        	StringBuilder out=new StringBuilder();
	        	
	        	while((line = reader.readLine()) != null)
	        		out.append(line);
	        	
	        	XMLRecord = out.toString();
	        	//System.out.println(XMLRecord);
	        	in.close();
	        }
	        
	        else
	        {
	        	System.out.println(con.getErrorStream());
	        }
	        
	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        InputStream is = new ByteArrayInputStream(XMLRecord.getBytes("UTF-8"));
	        org.w3c.dom.Document doc = dBuilder.parse(is);
	        doc.getDocumentElement().normalize();
	        
	        try {
	        	value=doc.getElementsByTagName("Itemlockowner").item(0).getTextContent();
	        }
	        catch(NullPointerException e)
	        {
	        	value="PLM Classic";
	        }
		}catch(Exception e)
		{
			value="Product not found";
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(value);
		return value;
	}
	
	private void writeInfoOutputFile(ArrayList<String> finalOutPutList) throws Exception
	{
		FileWriter outputFile = null;
		try
		{
		String output_csvHeader="ProductNumber"+commacsvSeparator+"R-State"+commacsvSeparator+"SourceSystem";	
		outputFile = new FileWriter(outputpath);    
	     
		outputFile.write(output_csvHeader);
		
		for(String eachRecord:finalOutPutList)
		{
			outputFile.write("\n"+eachRecord);
		}
		
		outputFile.close();
		}
		catch (Exception e)
		{
			if(outputFile!=null)
			{
				outputFile.close();
			}
		}
	}

}
