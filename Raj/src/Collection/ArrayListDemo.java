
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*  time : 20.24
		 *  ArrayList is resizable
		 *  Heterogeneous objects are allowed or different types of objects are allowed
		 *  Data structure -Growable Array or dynamic array
		 *  Data Retrieval is faster
		 *  add/removel of an element at first/middle position needs more sift operations
		 *   ArrayList are better to use for the search operations
		 *  
		 *  Get() and remove() will return us the elements present in particular index.
		 *  get() will not remove the particular element from the arraylist
		 *  remove() will remove the particular element from the arraylist
		 */
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add(10);// allows the duplicate elements
		al.add(10);
		al.add(null);
		al.add(true);
		al.add("Raj");
		al.add(" ");// allows the null value
		al.add('c');// follows the insertion order
		al.add(3,"Saranya");
		
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.contains("Raji"));
		System.out.println(al.get(2));
		System.out.println(al.get(6));
		System.out.println(al.remove(1));
		al.removeAll(Collections.singletonList(null));
		System.out.println(al);
		al.set(2, "abcd");
		System.out.println(al);
		System.out.println("Index : "+al.indexOf("Raj"));
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println("al2 list is : "+al2);
		ArrayList al3=new ArrayList();
		al3.add("Chennai");
		al3.add("Mumbai");
		al3.add("karnataka");
		al3.add("Delhi");
		System.out.println("al3 list is : "+al3);
		al3.addAll(2,al);
		System.out.println("al3 after addition is : "+al3);
		List al4=al3.subList(0, 3);
		System.out.println("al4 list is "+al4);
		
	}

}
