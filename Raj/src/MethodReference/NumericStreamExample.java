package MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumericStreamExample {
	static BinaryOperator<Integer> bo=(x,y)-> x+y;
	public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2,3,4,5);
	System.out.println("Using Stream: "+calculateSumUsingStream(l1));
	
	IntStream l2=IntStream.rangeClosed(1, 5);
	System.out.println("Using IntStream: "+calculateSumUsingIntStream(l2));

	}
	
	static int calculateSumUsingStream(List<Integer> list) {
		return list.stream().reduce(0,bo);
	}
	
	static int calculateSumUsingIntStream(IntStream list) {
		return list.sum();
		
	}

	
}
