
public class EmailValidator {

	public static void main(String[] args) {
		String str="deepshikha0108199@gmail.com";
		int x=str.indexOf('@');
		int y=str.indexOf('.');
		if(str.lastIndexOf('@')==x && str.lastIndexOf('.')==y && str.substring(x,y).length()>=3 && str.substring(y).length()>=2 && str.substring(0,x).length()>=4)
		{
			System.out.println(true);
		}else
				System.out.println(false);
		
		
	}

}
