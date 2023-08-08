package FunctionalInterface;
import java.util.Arrays;
import java.util.List;
//49.45, 55.0
import java.util.function.Consumer;

/*
 *Consumer<T> is an in-built functional interface introduced in java 8.
 *consumer can be used in all context where an object needs to be consumed
 *It taken as input and some operation is to be performed on the object without returning any result.
 *It has accept() , andThen() methods 
 * 
 */

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c1=(s)-> System.out.println(s.toUpperCase());
		c1.accept("Java8 feature");
		
		Consumer<String> c2=(s)-> System.out.println(s.toLowerCase());
		c2.accept("Java8 feature");
		
		c1.andThen(c2).accept("Java8 features");
		
		Consumer<Integer> c3=(x)-> System.out.println(x*5);
		Consumer<Integer> c4=(x)-> System.out.println(x+100);
		c3.andThen(c4).accept(10);
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6);
		list.stream().forEach(t-> System.out.println("Print : "+t*2));
		
	}

}

