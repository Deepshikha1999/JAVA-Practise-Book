
@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default String sayBye()
	{
		return "GoodBye";
	}//feature in java above version 8 and above
	
	static void greet()
	{
		System.out.println("greetings from my side");
	}
}
