package MethodReference;

import java.util.Comparator;

public class MethodReferenceExample {
	/*
	 * Method reference is  used for like while  we are iterating or processing multiple data in that like 
	 * we have a 1000 thousand of employee  required are there. if you want to fetch the particular employee record with salary
	 * is greater then 5000 and all. so for that we are doing some iterations. after iteration we are printing always.
	 * like we are doing system.out.println for that employee details and all. instead of that directly we can use 
	 * the method reference. that method reference will insert all the state. 
	 * 
	 * 
	 * 
	 * It replace Lambda expression
	 * ClassName :: staticMethodName-> static method reference
	   objectName :: methodName-> instance method reference
	   ClassName :: new-> constructor reference
	 
	 */

	public static void main(String[] args) {
		System.out.println("Before Java8: "+MethodReferenceExample.compare(10, 20));
		
		Comparator<Integer> comp=MethodReferenceExample :: compare;
		System.out.println("In Java8 :"+comp.compare(10, 40));
		
		Comparator<Integer> comp1=(a,b)-> compare(a,b);
		System.out.println("In Java8 :"+comp1.compare(100, 40));

	}
	
	public static int compare(Integer a,Integer b) {
		return Integer.compare(a, b);
		
	}

}

