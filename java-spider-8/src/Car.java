
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features) {
	//vararg: (...)(to be used for arrays) can only be the last argument of method 
		super();
		this.model = model;
		this.features = features;
	}
	public void specs()
	{
		System.out.println("--Features of model--");
		for(String s:features)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		//String []x= {"white color","substantial ac","60kmph mileage","25L fuel capacity","6 Seater","sunroof"};
		Car alto=new Car("Suzuki Alto","white color","substantial ac","60kmph mileage","25L fuel capacity","6 Seater","sunroof");
		alto.specs();
		
		//String []y= {"white color","substantial ac","60kmph mileage","25L fuel capacity","power window","power steering"};
		Car astor=new Car("MG Astor","white color","substantial ac","60kmph mileage","25L fuel capacity","power window","power steering");
		astor.specs();
		
	}
}
