

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
	
<<<<<<< HEAD
	String wsurl=" https://rsb.internal.ericsson.com/REST/G3/CICD/Product/XXL/";
	
	String folderName="May17";
	String fileName="May17";
=======
	String wsurl=" https://rsb.internal.ericsson.com/REST/G3/CICD/Product/xs/";
	
	String folderName="Feb09";
	String fileName="Feb09";
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
	String fileSep = File.separator;
	String commacsvSeparator = ",";
	
	String Username = "V1FDILP";
	String Password = "uIO8ZNnH1y4qSK5MxNZLIMxa";
	
<<<<<<< HEAD
	String rootPath = "C:\\ericsson\\commercialstructures\\";
	//String rootPath = "mnt/sdb/plm/dil/dilsec01";
	String path=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+".csv";
	String outputpath=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+"_outputFile.csv";
	String logFile = rootPath + fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+"_extract.log";
	//String path=rootPath+fileSep+"dm"+fileSep+"inputfiles"+fileSep+folderName+fileSep+"P_C_ProductExtract"+".csv";
	//String outputpath=rootPath+fileSep+"dm"+fileSep+"outputfiles"+fileSep+folderName+fileSep+fileName+"outputFile.csv";
	
	public static void main(String[] args) throws Exception {
		SegregatePLMClassicAndCore segregatePLMClassicAndCore=new SegregatePLMClassicAndCore();
		PrintStream o = new PrintStream(new File(segregatePLMClassicAndCore.logFile));
=======
	//String rootPath = "C:\\ericsson\\commercialstructures\\";
	String rootPath = "mnt/sdb/plm/dil/dilsec01";
	//String path=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+".csv";
	//String outputpath=rootPath+fileSep+"Segregate"+fileSep+folderName+fileSep+fileName+"outputFile.csv";
	
	String path=rootPath+fileSep+"dm"+fileSep+"inputfiles"+fileSep+folderName+fileSep+"P_C_ProductExtract"+".csv";
	String outputpath=rootPath+fileSep+"dm"+fileSep+"outputfiles"+fileSep+folderName+fileSep+fileName+"outputFile.csv";
	
	public static void main(String[] args) throws Exception {
		SegregatePLMClassicAndCore segregatePLMClassicAndCore=new SegregatePLMClassicAndCore();
		PrintStream o = new PrintStream(new File("extract.log"));
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
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
<<<<<<< HEAD
			System.out.println(i+" "+data[0]+" "+data[1]);
			if(data[1].trim().equals(""))
				data[1]="HighestRState";
			String sourcetype=webserviceUrl(data[0].trim()/*,data[data.length-1].trim()*/);
			outputProductList.add(data[0].trim()+commacsvSeparator/*+data[data.length-1].trim()*/+commacsvSeparator+sourcetype);
=======
			System.out.println(i+" "+data[0]+" "+data[data.length-1]);
			//if(data[1].trim().equals("-"))
				//data[1]="HighestRState";
			String sourcetype=webserviceUrl(data[0].trim(),data[data.length-1].trim());
			outputProductList.add(data[0].trim()+commacsvSeparator+data[data.length-1].trim()+commacsvSeparator+sourcetype);
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
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
	
<<<<<<< HEAD
	public String webserviceUrl(String productNumber/*,String productRevision*/) throws Exception 
=======
	public String webserviceUrl(String productNumber,String productRevision) throws Exception 
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
	{
		String value = "";
		try {
			
			String authString = Username.trim() + ":" + Password.trim();
		    String authStringEnc = "Basic " + new String(Base64.getEncoder().encode(authString.getBytes()));
		    
		    String productNumber_InURL="";
		    String productRevision_InURL="";
		    
		    try {
		    	productNumber_InURL = URLEncoder.encode(productNumber,"UTF-8").replace("+", "%20");
<<<<<<< HEAD
		    	//productRevision_InURL = URLEncoder.encode(productRevision,"UTF-8").replace("+", "%20");
=======
		    	productRevision_InURL = URLEncoder.encode(productRevision,"UTF-8").replace("+", "%20");
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
		    }catch(UnsupportedEncodingException e)
		    {
		    	e.printStackTrace();
		    }
<<<<<<< HEAD
		    String webserviceurl=wsurl+productNumber_InURL/*+"/"+productRevision_InURL*/+"?CoreData&LifeCycleData";
=======
		    String webserviceurl=wsurl+productNumber_InURL+"/"+productRevision_InURL+"?CoreData&LifeCycleData";
>>>>>>> c83bce004a7a09825293d9cb42e5766c757b9d75
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
