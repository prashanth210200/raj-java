package MethodReference;
//45.10
import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		Comparator<Integer> c1=new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				
				return x.compareTo(y);
			}
			
		};
		System.out.println("Before Java8 :"+c1.compare(50, 10));
		
		Comparator<Integer> c2=(x,y)->x.compareTo(y);
		System.out.println("In Java8 :"+c2.compare(20, 40));
	}

}
