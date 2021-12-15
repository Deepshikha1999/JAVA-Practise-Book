import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo", "lili");
		map.put("jack", "rose");
		
		System.out.println("scott: "+map.get("scott"));
		System.out.println("polo: "+map.get("polo"));
		System.out.println("jack: "+map.get("jack"));
		
		System.out.println("--Finding value using keyset without knowing key");
		for(String s:map.keySet())
		{
			System.out.println(s+" : "+map.get(s));
		}
	}
}
