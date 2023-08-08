
package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/*
 * This Functional interface used for conditional check.
 * Taken  single input and return boolean value 
 * It has AND, OR,test(), Equalsto methods
 * 
 * 
 * 
 * 
 */

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> greaterThan=a-> a>=50;
		Predicate<Integer> lessThan=a-> a<50;
		Predicate<Integer> equalsto=a-> a==50;
		
		/*boolean lessThanResult=lessThan.test(20);
		System.out.println("Less Than: "+lessThanResult);
		
		boolean greaterThanResult=greaterThan.test(20);
		System.out.println("Greater Than: "+greaterThanResult);
		
		boolean equalstoResult=equalsto.test(20);
		System.out.println("Equalized: "+equalstoResult);*/
		System.out.println("AND: "+greaterThan.and(lessThan).test(20));
		System.out.println("OR: "+greaterThan.or(lessThan).test(20));
		System.out.println("Equals: "+greaterThan.and(equalsto).test(50));

		List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("Print Even : "+t));
	}

}
