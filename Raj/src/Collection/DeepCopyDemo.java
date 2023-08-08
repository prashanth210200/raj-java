package Collection;

class ABCD  
{  
// instance variable of the class ABC  
int x = 30;  
}  

public class DeepCopyDemo {

	public static void main(String[] args) {
		// creating an object of the class ABC  
		ABCD obj1 = new ABCD();  
		  
		// it will copy the reference, not value  
		ABCD obj2 = new ABCD();  
		  
		// updating the value to 6   
		// using the reference variable obj2  
		obj2.x = 6;  
		  
		// printing the value of x using reference variable obj1   
		System.out.println("The value of x is: " + obj1.x);  
	}

}
