
package Collection;

import java.util.ArrayList;
import java.util.Collections;
/*
 *    Collection	                                          
-> It is an interface.
-> It is used to represent a group of individual objects as a single unit. 	
-> The Collection is an interface that contains a static method since java8. 
	The Interface can also contain abstract and default methods.	
 * Collections
 * -> It is a utility class.
 * -> It defines several utility methods that are used to operate on collection.
 * -> It contains only static methods.
 */


public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add('y');
		al.add('c');
		al.add('b');
		al.add('t');
		al.add('n');
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 's'));
		
	}

}
