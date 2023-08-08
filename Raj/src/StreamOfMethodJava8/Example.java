package StreamOfMethodJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		/*
		 * Stream.of() method is used to create a stream from a sequence of elements. It
		 * allows you to convert a set of values or an array into a stream, which can
		 * then be processed using various stream operations
		 */
		Stream<String> stream = Stream.of("apple", "banana", "orange");
		stream.forEach(System.out::println);

		String[] fruits = { "apple", "banana", "orange" };
		Stream<String> stream1 = Stream.of(fruits);
		stream1.forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<List<Integer>> stream2 = Stream.of(numbers);
		stream2.forEach(System.out::println);

		Stream<Object> stream3 = Stream.of("apple", 1, true, 3.14);
		stream3.forEach(System.out::println);

		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

		int sum = numbers1.stream().filter(s -> (s % 2 == 0)).mapToInt(n -> n * 2).sum();

		System.out.println(sum);
		
		
		/*
		 * mapToInt() method is part of the Stream API and is used to transform elements of a stream into a
		 *  stream of primitive integers. 
		 * It allows you to apply a function to each element of a stream and obtain an IntStream containing the results.

			The mapToInt() method takes a ToIntFunction as a parameter, which is a functional interface that
			 represents a function that accepts an object and returns an int. This function is applied to each
			  element of the stream, and the results are collected into a new IntStream.
		 */
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

		IntStream lengths = names.stream()
		                        .mapToInt(String::length);

		lengths.forEach(System.out::println);
		
		System.out.println("MaptoBoject:");
		IntStream numbers2 = IntStream.of(1, 2, 3, 4, 5);

		Stream<String> numberStrings = numbers2.mapToObj(String::valueOf);

		numberStrings.forEach(System.out::println);

		/*
		 * The mapToObj method is similar to the map method, but it specifically converts the elements of a stream into objects 
		 * of a specific class. It takes a functional interface (typically a lambda expression or a method reference) 
		 * as an argument,which defines the transformation logic.
		 */ 


	}

}
