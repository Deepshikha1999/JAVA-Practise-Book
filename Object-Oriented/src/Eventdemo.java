
class EventImpl implements Event{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("outer class");
	}
	
}

public class Eventdemo {
	
	public class InnerEvent implements Event{

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			System.out.println("inner");
		}
		
	}
	
	public static class StaticInnerEvent implements Event{

		@Override
		public void doSomething() {
			// TODO Auto-generated method stub
			System.out.println("Static inner");
		}
		
	}
	
	public void nestedEvent()
	{
		class NestedEvent implements Event{

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("nested inner");
				
			}
			
		}
		
		NestedEvent ne=new NestedEvent();
		ne.doSomething();
	}
	
	public void oneMoreEvent()
	{
		Event e=new Event(){

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("one more");
			}
			
		};
	}
	
	public void oneLastEvent()
	{//anonymous class
		Event e=()->System.out.println("do something in last event");
		e.doSomething();
	}
	
	public static void main(String[] args)
	{
		EventImpl e1=new EventImpl();
		e1.doSomething();
		
		Eventdemo e2=new Eventdemo();
		InnerEvent e3=e2.new InnerEvent();
		e3.doSomething();
		
		Eventdemo.StaticInnerEvent e4=new Eventdemo.StaticInnerEvent();
		e4.doSomething();
		
		e2.nestedEvent();
		e2.oneMoreEvent();
		
		e2.oneLastEvent();
		
		
		
	}

}
