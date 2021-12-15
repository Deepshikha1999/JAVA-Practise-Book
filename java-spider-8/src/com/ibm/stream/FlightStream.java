package com.ibm.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStream {

	public static void main(String[] args) throws IOException {
		List<Flight> flights=null;
		Stream<String> lines=Files.lines(Paths.get("src/flights.txt"));
		flights = lines.map(l -> {
			String[] a = l.split(",");
			return new Flight(Integer.parseInt(a[0]), a[1], a[2], a[3]);
		}).collect(Collectors.toList());
		flights.forEach(System.out::println);
		
		//Print details of flight 123
		System.out.println("-------------------------------------------------------------");
		System.out.println(flights.stream().filter(f->123==f.getCode()).findFirst().get());
		
		//Print details of flight whose carrier name is jet
		System.out.println("-------------------------------------------------------------");
		flights.stream().filter(f->f.getCarrier().equals("jet")).collect(Collectors.toList()).forEach(System.out::println);
		
		//Print details of file whose source is kochi and destination is kolkata
		System.out.println("-------------------------------------------------------------");
		flights.stream().filter(f->f.getSource().equals("kochi")&& f.getDestination().equals("kolkata"))
				.collect(Collectors.toList()).forEach(System.out::println);
	}

}
