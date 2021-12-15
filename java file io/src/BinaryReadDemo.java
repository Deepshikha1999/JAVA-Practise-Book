import java.io.FileInputStream;

public class BinaryReadDemo {
	public static void main(String[] args) {
		String path="src/amazing.txt";
		
		FileInputStream istream=null;
		try {
			istream=new FileInputStream(path);
			int ch=0;
			while(true)
			{
				ch=istream.read();
				if(ch==-1)
					break;
				System.out.println((char)ch);
			}
			
			byte[] content=new byte[istream.available()];
			istream.read(content);
			System.out.println(new String(content));
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				istream.close();
			}catch(Exception e) {
				e.printStackTrace();}
		}
	}

}
