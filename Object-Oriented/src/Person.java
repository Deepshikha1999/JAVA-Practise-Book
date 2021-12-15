
public class Person {

	private String name;
	private int age;

	public void print() {
		System.out.println(name + "\t" + age);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "\t" + age;
	}

	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person) {
			Person p=(Person)obj;
		
		if(p.name.length()==this.name.length() && p.age==this.age)
		{
			for(int i=0;i<this.name.length();i++)
			{
				if(this.name.charAt(i)!=p.name.charAt(i))
					return false;
			}
			return true;
		}
		}
		return false;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Deep", 22);
		p1.print();

		Person p21 = new Person("Deep", 22);
		p21.print();
		
		System.out.println(p1);//implicitly calls toString() method
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		
		Person p2 = new Person("Divyanshu",18);
		p2.print();
		
		System.out.println(p2);//implicitly calls toString() method
		System.out.println(p2.hashCode());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p21));
		
		
	}

	public Person() {
		// super();
		this("Anonymous", -1);// constructor chaining
	}
}
