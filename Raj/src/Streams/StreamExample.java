package Streams;

import java.util.stream.Stream;
/*
 * Stream:
 * Sequence of data elements
 * It can be performed either sequentially or parallel.
 * Do not support indexed access
 * Lazy access supported- intermediate operation
 * Designed for lambdas.
 * 
 * Streams API:
 * Stream API have a multiple type of method are there like intermediate, terminal methods.  map, flat map,filter, reduce
 *-> Stream API is used to process collections of objects.
 *-> Sequence of elements
 * A stream is not a data structure instead it takes input from the Collections, Array or I/O channels.
 * Stream don't change the original data structure, they only provide the result as per the pipelined methods
 * 
 * Why we need stream?
 * -> We can achieve Functional programming
 * -> code Reduce
 * -> Bulk operation
 * 
 * intermediate:
 * map,flatmap, collectors which will be work internally
 * 
 * Terminal operations:
 * will have a conditional check filter, sort 
 * 
 */

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer> s1=Stream.of(0,1,2,3,4,5);
		s1.forEach(p->System.out.println(p));
		
		Integer arr[]=new Integer[] {1,2,3,4,5,6};
		Stream<Integer> s2=Stream.of(arr);
		s2.forEach(p->System.out.println(p));

	}

}
