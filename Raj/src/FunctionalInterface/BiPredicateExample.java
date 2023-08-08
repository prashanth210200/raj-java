package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
 static BiPredicate<Integer,Integer> biPredicate=(a,b)-> a>=50 && b<50;
	public static void main(String[] args) {
		boolean result=biPredicate.test(100,58);
		System.out.println(result);
	}

}
