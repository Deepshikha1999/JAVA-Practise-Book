import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;//buffer for reading
		BufferedOutputStream outBuffer = null;//buffer for writing
		try {
			inFile = new FileInputStream("C:\\\\Users\\\\002UHM744\\\\Desktop\\\\full stack java\\\\java jar file\\\\jre.exe"); //81mb
			outFile = new FileOutputStream("C:\\\\Users\\\\002UHM744\\\\Desktop\\\\full stack java\\\\java jar file\\\\fasttemp.exe");
			inBuffer = new BufferedInputStream(inFile, 1024*16); 
			outBuffer = new BufferedOutputStream(outFile, 1024*16);
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inBuffer.read();
				if(ch == -1) break;
				outBuffer.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in "+(ms2-ms1)+" ms");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				inBuffer.close();
				outBuffer.close();
				inFile.close();
				outFile.close();
			} catch(Exception e) { }
		}
	}//1880ms
}