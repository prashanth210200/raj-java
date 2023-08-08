package Collection;

import java.util.ArrayList;

/*
 * -> It was introduced in java 1.5 version
 * -> The generic collection disable the type casting and there is no use of type casting when it is used in generics.
 * -> The generic collections are type safe and checked at compile time. 
 *  
 */  
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Raj");
		al.add("Rishi");
		System.out.println(al);
		
		
	}

}



