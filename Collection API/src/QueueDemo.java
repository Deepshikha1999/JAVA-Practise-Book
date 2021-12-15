import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue<String> q = new LinkedList<String>();
		Queue<String> q=new PriorityQueue<String>();
		q.add("Black");
		q.add("Blue");
		q.add("Green");
		q.add("Yellow");
		q.add("Red");
		q.offer("Brown");
		for(String col:q)
			System.out.println(col);
		
		q.remove();
		System.out.println("----------------------------------------");
		for(String col:q)
			System.out.println(col);
		q.add("Black");
		System.out.println("----------------------------------------");
		for(String col:q)
			System.out.println(col);
		
		q.remove("Yellow");
		System.out.println("----------------------------------------");
		for(String col:q)
			System.out.println(col);
		
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}
/**q.add("Black");
q.add("Blue");
q.add("Green");
q.add("Yellow");
q.add("Red");
q.add("Brown");*/