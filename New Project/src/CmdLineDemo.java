
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println(sum);
		
		int x=10;//Primitive variable
		Integer obj=x; //Boxing
		int z=obj; //Unboxing
		System.out.println(x+obj*z);
	}

}
