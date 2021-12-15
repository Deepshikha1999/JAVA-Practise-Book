
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");//heap
		String s2="Hello";//string pool
		String s3="Hello";
		
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		System.out.println(s1.length());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,5));

	}

}
