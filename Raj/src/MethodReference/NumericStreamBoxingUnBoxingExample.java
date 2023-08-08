package MethodReference;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnBoxingExample {

	public static void main(String[] args) {
		boxingMethod().forEach(System.out::println);
		System.out.println("Sum is : "+calculateSum( boxingMethod()));
	}
	
	static List<Integer> boxingMethod(){
		return IntStream.rangeClosed(1, 100)
				.boxed()
				.collect(Collectors.toList());
	}
	
	static int calculateSum(List<Integer> li) {
		return li.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}
	
	

}
