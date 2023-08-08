package FunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionExample {
	
	static BiFunction<String, String, String> bf1=(a,b)-> a.concat(b);
	
	public static void main(String[] args) {
		
		System.out.println(bf1.apply("Java8 ", "Features"));
	}

}
