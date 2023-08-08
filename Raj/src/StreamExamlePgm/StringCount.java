package StreamExamlePgm;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCount {
	
	
public static void main(String args[]) {
	int[] arr1 = { 80, 10, 15, 2, 35, 60 };
	int[] arr2 = { 35, 80, 40, 2, 65, 74 };

	IntStream stream1 = Arrays.stream(arr1);
	IntStream stream2 = Arrays.stream(arr2);
	Set<Integer> duplicates = stream1.boxed()
	        .filter(stream2.boxed().collect(Collectors.toSet())::contains)
	        .collect(Collectors.toSet());
	for (int duplicate : duplicates) {
	    System.out.println(duplicate);
	}

}



}
