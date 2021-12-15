
public class DemoTest {

	public static void main(String[] args) {
		
		ChildDemo<String,Integer> ch=new ChildDemo<String,Integer>("Deepshikha",12);
		ch.setTemp(22);
		System.out.println(ch.getDemo()+" "+ch.getTemp());
		ch.setDemo("Divyanshu");
		ch.setTemp(18);
		System.out.println(ch.getDemo()+" "+ch.getTemp());
		
		Demo<String> d1=new Demo<String>("Hello");
		//d1.setDemo(12);error
		System.out.println(d1.getDemo());
		
		Demo<Double> d2=new Demo<Double>(12.799);
		System.out.println(d2.getDemo());
	}

}
