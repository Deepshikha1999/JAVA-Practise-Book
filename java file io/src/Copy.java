import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
		try {
			inFile = new FileInputStream("C:\\\\Users\\\\002UHM744\\\\Desktop\\\\full stack java\\\\java jar file\\\\jre.exe"); //81 MB 
			outFile = new FileOutputStream("C:\\\\Users\\\\002UHM744\\\\Desktop\\\\full stack java\\\\java jar file\\\\temp.exe");
			System.out.println("Copying file");
			int ch=0;
			long ms1=System.currentTimeMillis();
			
			while(true)
			{
				ch=inFile.read();
				if(ch==-1)break;
					
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				inFile.close();
				outFile.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}//297834ms
//byte by byte transfer