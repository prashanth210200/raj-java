package MethodReference;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static void main(String[] args) {
		System.out.println("Map to Double: "+map2Double());
		System.out.println("Map to Long: "+map2Long());
		System.out.println("Map to Object: "+map2Object());

	}
	
	static double map2Double() {
		return IntStream.rangeClosed(1, 10)
				.mapToDouble(x->x)
				.sum();
		}
	
	static long map2Long() {
		return IntStream.rangeClosed(1, 10)
				.mapToLong(x->x)
				.sum();
		}
	
	static List<Integer> map2Object(){
		
		return IntStream.rangeClosed(1, 10)
				.mapToObj(x->x)
				.collect(Collectors.toList());
	}

}
