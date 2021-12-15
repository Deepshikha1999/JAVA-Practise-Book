//Generic class
public class Demo<X> {

	private X demo;

	public Demo(X demo) {
		super();
		this.demo = demo;
	}

	public X getDemo() {
		return demo;
	}

	public void setDemo(X demo) {
		this.demo = demo;
	}

	/**public static void main(String[] args) {
		//Demo d1=new Demo("Hello");
		//d1.setDemo(23);
		//System.out.println(d1.getDemo());
		
		//Demo d2=new Demo(12);
		//d2.setDemo("Hey");
		//System.out.println(d2.getDemo());

		Demo<String> d1=new Demo<String>("Hello");
		//d1.setDemo(12);error
		System.out.println(d1.getDemo());
		
		Demo<Double> d2=new Demo<Double>(12.799);
		System.out.println(d2.getDemo());
	}*/

}
