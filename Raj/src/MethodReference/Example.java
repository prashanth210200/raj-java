package MethodReference;

import java.util.Comparator;

public class Example {

	public static void main(String[] args) {
		
		Comparator<Integer> com=Example::compare;
		System.out.println(com.compare(20,28));
		
	}
	public static int compare(Integer a, Integer b) {
		return Integer.compare(a, b);
		
	}
	

}
