
public class AlphaBetaTest {

	public static void main(String[] args) {
		Alpha a=new Alpha();
		a.demo();
		//Beta bt=a;//illegal
		
		Beta b=new Beta();
		b.demo1();
		b.demo();
		
		Alpha ab=b;//Up-casting->Implicit->Polymorphism
		ab.demo();
		//ab.test();//Invalid statement	
		
		Beta ba=(Beta)ab;//Legal-Down-Casting-Explicit
		ba.demo();
		ba.demo1();
	}

}
