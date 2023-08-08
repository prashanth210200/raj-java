
package StreamExamlePgm;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Stream.of() method is used to create a stream from a sequence of elements. It
		 * allows you to convert a set of values or an array into a stream, which can
		 * then be processed using various stream operations
		 */
		// find length
		String str = "Manager is here for my special";
		System.out.println("Find Length:");
		int length = Stream.of(str).map(String::length).findFirst().get();
		System.out.println(length);
		long count1=str.chars().count();
		System.out.println(count1);

		// charecter count
		System.out.println("Find Single Character:");
		long count = str.chars().filter(s -> s == 'e').count();
		System.out.println(count);
		

		// Uppercase
		System.out.println("Convert UpperCase:");
		Consumer<String> upper = s -> System.out.println(s.toUpperCase());
		upper.accept(str);

		System.out.println("Convert LowerCase:");
		List<String> uppercase = Arrays.asList("Raj", "Saranya", "Rishi");
		uppercase.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
		
		//count each string length
		List<Integer> intList=uppercase.stream()
				.map(String :: length) //s-> s.length()
				.collect(Collectors.toList());
		System.out.println("Length List: "+intList);

		// Uppercase
		System.out.println("Convert LowerCase:");
		List<String> up = uppercase.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(up);

		// count Uppercase
		System.out.println("Count UpperCase:");
		long ucount = str.chars().filter(s -> Character.isUpperCase(s)).count();
		System.out.println(ucount);

		// vowels
		System.out.println("Count Vowels");
		long vowels = str.chars().filter(s -> (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u')).count();
		System.out.println(vowels);

		// count each character
		System.out.println("Count Each Character:");
		Map<String, Long> l = str.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		System.out.println(l);
		
		// count each character
				System.out.println("Count Each Duplicate Character:");
				Map<String, Long> duplicate = str.chars().mapToObj(x -> (char) x)
						.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
				duplicate.forEach((p,q)->{
					if(q>1) {
						System.out.println(p+"-"+q);
					}
				});
				
				//count each number
				Integer[] myArray = { 10, 20, 10, 30, 20, 20, 40, 50, 60, 50, 50, 60 };

				Map<Integer, Long> countMap = Arrays.stream(myArray)
						.collect(Collectors.groupingBy(number -> number, Collectors.counting()));

				//countMap.forEach((number, count) -> System.out.println(number + " appears " + count + " times."));
				countMap.forEach((x,y)->{
					if(y>0) {
						System.out.println(x+"-"+y);
					}
				});
	

		// Reverse String
		System.out.println("Reverse the String:");
		List<String> st = Arrays.asList(str);
		String reverse = st.stream().map(v -> new StringBuilder(v).reverse()).collect(Collectors.joining(" "));
		System.out.println(reverse);
		// Reverse String
		System.out.println("Reverse the String:");
		List<String> st1 = Arrays.asList(str.split(" "));
		String reverse1 = st1.stream().map(v -> new StringBuilder(v).reverse()).collect(Collectors.joining(" "));
		System.out.println(reverse1);

		// Remove special characters
		System.out.println("Remove Special Character:");
		String s1 = "@@$#35fngdfn";
		String s2 = s1.replaceAll("[^1-9a-zA-Z]", "");
		System.out.println(s2);

		// Remove duplicate characters
		System.out.println("Remove Duplicate Characters:");
		Set<Character> se = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			se.add(str.charAt(i));
		}
		for (Character c : se) {
			System.out.print(c);
		}

		Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(entrySet -> System.out.println(entrySet.getKey() + " : " + entrySet.getValue()));

		uppercase.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.forEach(entrySet -> System.out.println(entrySet.getKey() + " : " + entrySet.getValue()));

		uppercase.stream().collect(Collectors.groupingBy(Function.identity())).entrySet()
				.forEach(entrySet -> System.out.println(entrySet.getKey() + " : " + entrySet.getValue()));
		
		System.out.println("Convert char to string:");
		char[] ch = { 'a', 'b', 'c', 't', 'i', 'o' };
		String m = Stream.of(ch).map(n -> new String(n)).collect(Collectors.joining());
		System.out.println(m);
		System.out.println("Find Highest Length:");
		String[] str1 = { "SpringBoot", "Microservices", "Java", "Hibernets" };
		String str2 = Arrays.stream(str1).reduce((m1, m2) -> m1.length() > m2.length() ? m1 : m2).get();
		System.out.println(str2);
		
		

	}

}