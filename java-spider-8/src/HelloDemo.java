
public class HelloDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=()->"Hello World";
		System.out.println(h.sayHello());
		
		Hello h2=()->{
			String msg="Hola Flamingoes";
			return msg;
		};
		
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
		Hello.greet();
	}

}//Single abstract method and lambda
