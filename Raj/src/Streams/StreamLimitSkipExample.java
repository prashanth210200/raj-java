package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkipExample {
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apple","Orange","Graphs","Banana","Pineapple");
		fruits.stream().limit(3).forEach(System.out::println);
		
		List<Integer>intList=Arrays.asList(1,2,3,4,5,6,7,8);
		int sum=intList.stream().limit(4).skip(2).reduce(0, (x,y)-> x+y);
		System.out.println("Sum: "+sum);
		
		int skip=intList.stream().skip(4).reduce(0, (x,y)-> x+y);
		System.out.println("Skip: "+skip);
		
		long num= fruits.stream().filter(x->x.length()>5).count();
		   System.out.println("Count Number : "+num);
	
		   boolean add=intList.stream().skip(4).reduce(0, (x,y)-> x+y)==14;
			System.out.println("Skip: "+add);
	
	}

}

