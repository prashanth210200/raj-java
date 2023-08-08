package StreamExamlePgm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Map():
 * Map() and FlatMap() both methods are intermediate method and returns another stream as part of the output
 * Transform one type to another type
 * Its not the Map collection
 * Map() method used for data transformation
 * It is called One-to-One mapping
 * 
 */

public class StreamMapExample {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apple","Orange","Banana","Pineapple");
		
		fruits.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
		
		String str=fruits.stream().map(u->u.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);
		
		List<Integer> intList=fruits.stream()
				.map(String :: length) //s-> s.length()
				.collect(Collectors.toList());
		System.out.println("Length List: "+intList);
		
	String l=fruits.stream().reduce((m1,m2)->m1.length()>m2.length()?m1:m2).get();
	System.out.println(l);
	

	}

}
