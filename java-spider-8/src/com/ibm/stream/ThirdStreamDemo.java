package com.ibm.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdStreamDemo {

	public static void main(String[] args) {
		
		Map<String,String> people=new HashMap<String,String>();
		people.put("Polo", "Pune");
		people.put("Mili", "Mumbai");
		people.put("Nick", "Nasik");
		System.out.println("-------------------------------------------------------------");
		people.values().forEach(System.out::println);
		
		List<String> cities=people.values().stream().sorted().collect(Collectors.toList());
		System.out.println("-------------------------------------------------------------");
		cities.forEach(System.out::println);
		
		Map<String,List<String>> contacts=new HashMap<>();
		contacts.put("Furdo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Jack", Arrays.asList("2323-4545","6565-9898"));
		System.out.println("-------------------------------------------------------------");
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		//sort and collect contacts map value into a lists and print
		
		List<String> con=contacts.values().stream().flatMap(Collection::stream).sorted().collect(Collectors.toList());
		System.out.println("-------------------------------------------------------------");
		con.forEach(System.out::println);

	}

}
