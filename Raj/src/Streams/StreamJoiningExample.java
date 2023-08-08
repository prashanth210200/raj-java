package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {

	public static void main(String[] args) {
		char[] ch= {'a','e','i','o','u'};
		String join = Stream.of(ch)
				.map(arr-> new String(arr))
				.collect(Collectors.joining());
		System.out.println("Joined String : "+join);
				
	}

}
