package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set; 
import java.util.stream.Collectors;


		/*Collectors class provides a set of static methods that are used in conjunction with the Stream API 
		 * to perform various reduction operations on the elements of a stream. These reduction operations allow 
		 * you to collect stream elements into various data structures or perform other aggregate operations
		 *
		 *Collecting elements into a List, Set, or Map:

			toList(): Collects the stream elements into a List.
			toSet(): Collects the stream elements into a Set.
			toCollection(collectionFactory): Collects the stream elements into a specific collection type specified 
			by the collectionFactory parameter.
			toMap(keyMapper, valueMapper): Collects the stream elements into a Map using the specified key and value mappers.
			toMap(keyMapper, valueMapper, mergeFunction): Collects the stream elements into a Map with the specified key and
			 value mappers, resolving collisions using the merge function.
		 *
		 */
		
		
		import java.util.Arrays;
		import java.util.List;
		import java.util.Map;
		import java.util.Set;
		import java.util.stream.Collectors;

		public class CollectorsExample {
		    public static void main(String[] args) {
		        // Example data
		        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date","elderberry");

		       // Collecting elements into a List
		        List<String> collectedList = fruits.stream()
		                .collect(Collectors.toList());
		        System.out.println("Collected List: " + collectedList);

		        // Collecting elements into a Set
		        Set<String> collectedSet = fruits.stream().collect(Collectors.toSet());
		        System.out.println("Collected Set: " + collectedSet);

				/*
				 * // Collecting elements into a Map (length as key, fruit as value)
				 * Map<Integer, String> collectedMap = fruits.stream()
				 * .collect(Collectors.toMap(f->f.length(), f -> f));
				 * System.out.println("Collected Map: " + collectedMap);
				 */
		        // Grouping elements by length
		        Map<Integer, List<String>> groupedByLength = fruits.stream()
		                .collect(Collectors.groupingBy(String::length));
		        System.out.println("Grouped by Length: " + groupedByLength);

		      // Partitioning elements into two groups (length <= 5 and length > 5)
		        Map<Boolean, List<String>> partitioned = fruits.stream()
		                .collect(Collectors.partitioningBy(fruit -> fruit.length() <= 5));
		        System.out.println("Partitioned: " + partitioned);

		         // Joining elements into a single String
		        String joinedString = fruits.stream()
		                .collect(Collectors.joining(", "));
		        System.out.println("Joined String: " + joinedString);
		    }
		


	}

/*
 * Collected List: [apple, banana, cherry, date, elderberry]
Collected Set: [banana, cherry, elderberry, apple, date]
Collected Map: {5=apple, 6=banana, 6=cherry, 4=date}
Grouped by Length: {4=[date], 5=[apple], 6=[banana, cherry]}
Partitioned: {false=[banana, cherry, elderberry], true=[apple, date]}
Joined String: apple, banana, cherry, date, elderberry

 */
