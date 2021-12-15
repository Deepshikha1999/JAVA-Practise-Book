
public class ArithmeticDemo {

	public static void main(String[] args) {
		Arithmetic a=(m,n)->(Integer)m+(Integer)n;
		System.out.println(a.sum(10, 20));
		
		Arithmetic a1=(m,n)->(Double)m+(Double)n;
		System.out.println(a1.sum(10.2, 20.6));
		
		Arithmetic a3=(m,n)->(String)m+(String)n;
		System.out.println(a3.sum("Deep", "Shikha"));
	}

}
