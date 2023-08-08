package Collection;
/*
 *Shallow Copy:
   It is fast as  new memory is not allocated.	
   Changes in one entity is reflected in other entity.	
   The default version of the clone() method supports shallow copy.	
   A shallow copy is less expensive.	
   Cloned object and the original object are joint.	 
 * 
 * Deep Copy:
 * It is slow as new memory is allocated.
 * Changes in one entity are not reflected in changes in another identity.
 * In order to make the clone() method support the deep copy, one has to override the clone() method.
 * Deep copy is highly expensive.
 * Cloned object and the original object are disjoint.
 */

class ABC  
{  
// instance variable of the class ABC  
int x = 30;  
}  

public class ShallowCopyDemo {

	public static void main(String[] args) {
		// creating an object of the class ABC  
		ABC obj1 = new ABC();  
		  
		// it will copy the reference, not value  
		ABC obj2 = obj1;  
		  
		// updating the value to 6   
		// using the reference variable obj2  
		obj2.x = 6;  
		  
		// printing the value of x using reference variable obj1   
		System.out.println("The value of x is: " + obj1.x);

	}

}
