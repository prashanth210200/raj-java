package CharsMethod;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Example {

	public static void main(String[] args) {
		/*
		 * chars() method is a part of the CharSequence interface and is used to create
		 * an IntStream that represents the characters of a CharSequence or a String.
		 * The IntStream represents the Unicode code points of the characters in the
		 * sequence.
		 */
		String str = "Hello, world!";
		long count = str.chars().count();
		System.out.println(count); // Output: 13

		String str1 = "Hello, world!";
		str1.chars().filter(Character::isLetter).forEach(ch -> System.out.print((char) ch));
		// Output: HelloWorld

		String str2 = "Java";
		int sum = str2.chars().sum();
		System.out.println(sum); 

		String str3 = "OpenAI";
		OptionalDouble average = str3.chars().map(Character::toLowerCase).distinct().average();
		average.ifPresent(System.out::println);
		
		String str4 = "OpenAI";
		IntStream avg = str3.chars().map(Character::toLowerCase);
		avg.forEach(System.out::println);
	}

}
