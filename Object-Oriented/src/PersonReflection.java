import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//Reflection
public class PersonReflection {
	public static void main(String[] args) throws Exception {
		/**Person p1=new Person("Deepshikha",22);
		System.out.println(p1);
		
		Class pc=p1.getClass();*/
		
		//Loading a Java class manually
		Class pc=Class.forName("Person");
		
		System.out.println(pc.getName());
		
		Constructor[] constructors=pc.getConstructors();
		System.out.println("--List of constructors--");
		for(Constructor c:constructors)
		{
			System.out.println(c);
		}
		
		Method[] methods=pc.getMethods();
		System.out.println("--List of methods--");
		for(Method m:methods)
		{
			System.out.println(m);
		}
		
		Field[] fields=pc.getFields();
		System.out.println("--List of feilds--");
		for(Field f:fields)
		{
			System.out.println(f);
		}
		
		Field[] decField=pc.getDeclaredFields();
		System.out.println("--List of declared fields--");
		for(Field f:decField)
		{
			System.out.println(f);
		}
		
		//Dynamically instantiating a Person class
		Object obj=constructors[0].newInstance();
		Object obj1=constructors[1].newInstance("Deepshikha",22);
		System.out.println(obj);
		System.out.println(obj1);
		
		Method print=pc.getMethod("print", null);
		print.invoke(obj,null);
	}
}
