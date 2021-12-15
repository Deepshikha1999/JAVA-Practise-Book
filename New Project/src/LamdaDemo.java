import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {
	
	public static void print(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=System.out::println;
		c.accept("Hello");
		c.accept("Hola");
		c.accept("Bonjour");
		
		Consumer<String> c2=LamdaDemo::print;
		c2.accept("Aloha");
		
		Supplier<String> s1=()->"Adios";
		System.out.println(s1.get());
		print(s1.get());
		
		Predicate<Integer> p1=(x)->x>=0;
		System.out.println(p1.test(5));
		System.out.println(p1.test(-1));
		
		Predicate<Integer>p2=(x)->x%2==0;
		System.out.println(p2.test(7));
		System.out.println(p2.test(4));
		
		BiPredicate<String,String> bp1=(s,s2)->s1.equals(s2);
		System.out.println(bp1.test("Deepshikha", "Deeps"));
		System.out.println(bp1.test("abc", "abc"));
		
		Function<Integer,Integer> f1=(x)->x*x;//1 return type 1 argument
		System.out.println(f1.apply(5));
		
		BiFunction<Integer,Integer,Integer> bf=(a,b)->a>b?a:b;//1 return type 2 argument
		System.out.println(bf.apply(5, 6)); 
	}

}
