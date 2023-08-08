package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAllOrAnyMatchExample {
static Predicate<String>p1=s-> s.length()>7;
static Predicate<String>p2=s-> s.length()>3;
public static void main(String args[]) {
	List<String> fruits=Arrays.asList("Apple","Orange","Graphs","Banana","Pineapple");
	System.out.println("All Match: "+fruits.stream().allMatch(p2));
	System.out.println("Any Match: "+fruits.stream().anyMatch(p1));
	
	
}

}
