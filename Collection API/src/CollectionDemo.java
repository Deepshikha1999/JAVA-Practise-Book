import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("Oracle");
		list.add("Microsoft");
		list.add("IBM");
		
		System.out.println("--Traversing over ArrayList using for..loop");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("--Traversing using iterator");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("--Traversing using for each loop");
		for(String s:list)
			System.out.println(s);
		
		LinkedList<String> link=new LinkedList<String>();
		link.add("Tesla");
		link.addFirst("Apache");
		link.add("Apple");
		link.addLast("Meta");
		
		list.addAll(link);
		System.out.println("--Traversing over updated ArrayList using for...each");
		for(String s:list)
			System.out.println(s);
		
		//Covert arraylist into hashset
		HashSet<String> set=new HashSet<String>(list);
		//set.addAll(list);
		System.out.println("--Traversing over set using for...each");
		for(String s:set)
			System.out.println(s);
		
		TreeSet<String> treeset=new TreeSet<String>(list);
		System.out.println("--Traversing over tree set using for..each");
		for(String s:treeset)
			System.out.println(s);
		
	}

}
