package Streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethods {
	static UnaryOperator<Integer> uo=x->x+5;
	static Supplier<Double> supp=Math :: random;

	public static void main(String[] args) {
		Stream<Integer> s1=Stream.iterate(0, uo).limit(10);
		s1.forEach(System.out::println);
		
		Stream<Double> s2=Stream.generate(supp).limit(10);
		s2.forEach(System.out::println);
		
		Stream.generate(new Random() :: nextInt).limit(10)
		.forEach(System.out :: println);
		
		Stream<String> s3=Stream.of("One","Two","Three","Four","Five");
		s3.forEach(System.out::println);

	}
	

}
