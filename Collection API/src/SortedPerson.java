import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {
		
		//Comparator<Person> pc=(p1,p2)->p1.getAge()-p2.getAge();
		//Comparator//<Person> pc2=(p1,p2)->(int)p1.getName().charAt(0)-(int)p2.getName().charAt(0);
		//<Person> pc2=(p1,p2)->p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> people=new TreeSet<Person>();//pc,pc2 are passed as argument if comaparable is not implemented in Person class
		people.add(new Person("Polo",21));
		people.add(new Person("Jack",30));
		people.add(new Person("Lili",20));
		
		for(Person p:people)
			System.out.println(p.toString());

	}

}
