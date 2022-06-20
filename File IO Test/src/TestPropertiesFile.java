import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestPropertiesFile {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		p.setProperty("username", "V1FDILP");
		p.setProperty("password", "uIO8ZNnH1y4qSK5MxNZLIMxa");
		
		p.store(new FileWriter("C:\\ericsson\\commercialstructures\\info.properties",true), "Java Properties example");
		
		Properties p1=new Properties();
		p1.load(new FileReader("C:\\ericsson\\commercialstructures\\info.properties"));
		System.out.println(p1.get("username")+" "+p1.getProperty("password"));
	}

}
