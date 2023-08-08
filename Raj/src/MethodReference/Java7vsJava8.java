package MethodReference;
//10.0
import java.util.stream.IntStream;

public class Java7vsJava8 {

	public static void main(String[] args) {
		int total=0;
		for(int i=0;i<=50;i++)
		{
			total+=i;
			
		}
		System.out.println("Before java8: "+total);
		
		int total1=IntStream.rangeClosed(0,50).sum();
		System.out.println("In java8 :"+total1);

	}

}
