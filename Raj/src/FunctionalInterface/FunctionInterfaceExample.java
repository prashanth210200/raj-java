package FunctionalInterface;

/*
 * -> takes single argument T and returns a result R.
 *->  T – Type of the input to the function.
      R – Type of the result of the function.
 * -> The Function interface consists of the following 4 methods as listed which are later discussed as follows:

		apply()
		andThen()
		compose()
		identity() 
      
 */

import java.util.function.Function;

public class FunctionInterfaceExample {
	static Function<String,Integer> f1=s-> s.length();
	static Function<String,String> f2=s-> s.toUpperCase();
	static Function<String,String> f3=s-> s.toUpperCase().concat("features");

	public static void main(String[] args) {
		int length=f1.apply("Java8");
		System.out.println("Length: "+length);
		System.out.println("And then: "+f2.andThen(f3).apply("Java8"));
		System.out.println("Compose: "+f2.compose(f3).apply("Java8"));
		

	}

}
