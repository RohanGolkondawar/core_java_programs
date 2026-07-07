package com.rohan.stream_api;

import java.util.*;



import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


record Product (int id, String name)
{
	
}
public class StreamDemo {
	
	public static void main(String[] args) {
		
//		int arr[] = {12,15,8,5,3,52,93};
//		
//		int sum = Arrays.stream(arr).sum();
//		System.out.println(sum);
//		
//		Arrays.stream(arr).boxed().map(i -> i*2).sorted((a,b) -> a - b).forEach(IO::println);
//	
//		Product p1 = new Product(1, "Camera");
//		Product p2 = new Product(2, "Laptop");
//		Product p3 = new Product(3, "Mobile");
//		Product p4 = new Product(4, "TV");
//		
//		Stream.of(p1,p2,p3,p4).sorted((a,b) -> b.name().compareTo(a.name())).forEach(IO::println);
		
		HashMap<String, Integer> course = new HashMap<String, Integer>();
		
		//course.computeIfAbsent("Scott", k -> k.length());
		
		course.computeIfAbsent("A", k -> k.length());
		course.computeIfAbsent("B", k -> 20);
		course.computeIfAbsent("A", k -> 30);
		course.computeIfAbsent("D", k -> 10);
		
		System.out.println(course);
		
		course.merge("A", 4, (k,v) -> v+2);
		System.out.println(course);
		
		course.computeIfPresent("B", (a,b) -> b+20);
		System.out.println(course);
		
		HashSet<String> hash = new HashSet<String>();
		hash.add(null);
		hash.add(null);
		hash.add(null);
		System.out.println(hash);
		
		List<String> names = Arrays.asList("Rohan", "Soham","Aryan");
		System.out.println(names);
		
		List<String> list = names.stream()
		             .sorted(Comparator.reverseOrder())
		             .toList();
		
		System.out.println(list);
		
		String words = "Java is really awesome fantastic";
		String[] split = words.split(" ");
		
	//	Stream<String> map = Arrays.stream(split).map(s -> s.toLowerCase());
	//	map.forEach(IO::println);
		
		String collect = Arrays.stream(split).map(word -> new StringBuilder(word).reverse().toString())
		.collect(Collectors.joining(" "));
		
		System.out.println(collect);
		
		
		IntStream.of(1,2,3,4,5,6).asLongStream().forEach(IO::println);
		
			
		
		
		
		
		
	}

   }

