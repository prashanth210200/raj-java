package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Map(): It is used for single data processing like if you have a employee record. we want to process the data so that will have 
   a map
 * Map() and FlatMap() both methods are intermediate method and returns another stream as part of the output
 * Transform one type to another type
 * Its not the Map collection
 * Map() method used for data transformation
 * It is called One-to-One mapping
 * 
 * FlatMap(): if we have list of employee record which is in the particular university and we want to execute the data for all the 
   list of employee who all available in the particular university and for that we want average mark and some things. that cases 
   we can go for the flatmap
 * FlatMap() is used for Data transformation and flattering 
 * flatmap() -> map()+ flattering
 * Transform one type to another type
 * Used to flatten a stream of collection
 * Applying one-to-many transformation to the elements
 * Create a new stream once flatten the elements
 */
import java.util.stream.Stream;


public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer>oddNumber=Arrays.asList(1,3,5,7,7,9);
		List<Integer>evenNumber=Arrays.asList(2,4,6,8,10);
		List<Integer>evenNumber1=Arrays.asList(2,4,6,8,10,11,12,13,14,15);
		
		List<List<Integer>> listOflist=Arrays.asList(oddNumber,evenNumber,evenNumber1);
		System.out.println("Before Flatern: "+listOflist);
		
		List<Integer>flattenList=listOflist.stream()
				.flatMap(List :: stream).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Flatten List :"+flattenList);
		
		
		//merge two list
		
		List<Integer>merge=(List<Integer>) Stream.concat(oddNumber.stream(), evenNumber.stream()).distinct()
				.collect(Collectors.toList());
	
		System.out.println(merge);
	}

	
}
