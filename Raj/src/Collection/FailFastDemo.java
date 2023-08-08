package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	/*
	 * Fail Fast Iterator:					
	 * -> They immediately stop operating when a fault is occurred in the system
	 * ->  Doesn't allow modifications of a collection while iterating over it. 
	 * 		If  we try to modify, they will throw ConcurrentModificationException 
	 * ->  They use original collection to traverse over the elements of the collection
	 * -> Ex: Iterators returned by ArrayList, HashMap.
	 * 
	 * Fail Safe Iterator:
	 * -> They don't stop operating even when a fault is occurred in the system
	 * -> Allow modifications of a collection while iterating over it.
	 * -> They use copy of the original collection to traverse over the elements of the collection.
	 * -> Ex: Iterator returned by ConcurrentHashMap 
	 */

	public static void main(String[] args) {
		  //creating map  
        Map<Integer, String> students = new HashMap<Integer, String>();   
        students.put(101, "Emma");   
        students.put(102, "Paul");   
        students.put(103, "Walker");   
          
        //creating an instance of the Iterator class  
        Iterator itr = students.keySet().iterator();   
          
        //iterating map using Iterator   
        while (itr.hasNext()) {  
            //printing elements of Map  
            System.out.println(students.get(itr.next()));   
    
            // adding an element to Map   
            students.put(104, "Rubby"); // on the next call of next() method, exception will be thrown.  
        }   

	}

}
