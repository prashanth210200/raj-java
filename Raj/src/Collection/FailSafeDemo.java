package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {
	/*
	 * Concurrent HashMap:
	 * -> Thread safe
	 * -> Synchronized 
	 * -> no lose of information
	 * -> Didn't allows null value
	 * -> Nature of flow fail safe
	 * -> Allow Runtime modification.
	 */

	public static void main(String[] args) {
		 //creating map  
        Map<Integer, String> students = new HashMap<Integer, String>();   
        students.put(101, "Emma");   
        students.put(102, "Paul");   
        students.put(103, "Walker");  
          
        //creating ConcurrentHashMap by copy students map   
        ConcurrentHashMap<Integer, String> copyStudents = new ConcurrentHashMap<Integer, String>(students);   
          
        //creating an instance of the Iterator class  
        Iterator itr = copyStudents.keySet().iterator();   
          
        //iterating map using Iterator   
        while (itr.hasNext()) {  
            //printing elements of copyStudents  
            System.out.println(copyStudents.get(itr.next()));   
    
            // adding an element to copyStudents   
            copyStudents.put(104, "Rubby"); // on the next call of next() method, exception will be thrown.  
        }   

	}

}
