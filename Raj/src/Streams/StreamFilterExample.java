package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
/*
 * Filter- For conditional check (filtering some data).
 * -> It access predicate method
 * -> It will give the true or false
 * -> if we are checking particular conditions like less then and greater then
 */

public class StreamFilterExample {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("Raj","Saranya","Rishi","Sidharth","Yazhini");
		Stream<String> updateNames= names.stream().filter(s->s.length()>3);
		//updateNames.forEach(System.out::println);
		
		names.stream().filter(t->t.startsWith("R")).forEach(t->System.out.println(t));
		
		Map <Integer, String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		//map.forEach((key,value)->System.out.println(key+" : "+value));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		
	}

}
