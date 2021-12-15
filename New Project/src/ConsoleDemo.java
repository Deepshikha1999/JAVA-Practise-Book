import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=console.next();
		System.out.println("Name: "+name);
		
		String nameRegex="[A-Z][a-z]{4,}";
		System.out.println(name.matches(nameRegex));
		
		String mobileRegex="[7-9]{1}[0-9]{9}";
		
		System.out.println("Email: ");
		String email=console.next();
		
		String mailRegex="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$ ";
		System.out.println("Email validation:"+email.matches(mailRegex));

	}

}
