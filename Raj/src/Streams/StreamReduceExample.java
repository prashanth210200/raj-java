package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
/*
 * Reduce is used for Aggregating data
 * Combine elements of a stream and produces a single value
 * 
 * 
 */


public class StreamReduceExample {
	static BinaryOperator<Integer> bo1=(a,b)->a+b;
	static BinaryOperator<Integer> bo2=(a,b)->a*b;
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> sum=list.stream().reduce((a,b)-> a+b);
		System.out.println("Sum : "+sum.get());
		
		int sum1=list.stream().mapToInt(i->i).sum();
		System.out.println("Sum : "+sum1);
		
		int mul=list.stream().reduce(1, bo2);
		System.out.println("Multiplication : "+mul);
		
		int add=list.stream().reduce(0, bo1);
		System.out.println("Addition : "+add);
		
	}

}
