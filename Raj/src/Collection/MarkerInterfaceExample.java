package Collection;
/*
 * tagging interface:
 * It is an empty interface (no field or methods).
 * It will give the runtime information about objects.
 * Examples of marker interface are Serializable, Cloneable and Remote interface.
 *  
 * The instanceof keyword checks whether an object is an instance of a specific class or an interface. 
 * The instanceof keyword compares the instance with type. The return value is either true or false .
 *  
 */

public class MarkerInterfaceExample {

	public static void main(String[] args) {
		TwoWheeler tw=new TwoWheeler();
		FourWheeler fw=new FourWheeler();
		if(tw instanceof Parking) {
			System.out.println("You are allowed to enter");
		}
		else {
			System.out.println("You are not allowed to enter");
		}
		if(fw instanceof Parking) {
			System.out.println("You are allowed to enter");
		}
		else {
			System.out.println("You are not allowed to enter");
		}

	}

}
 interface Parking{
	 
 }
 class TwoWheeler implements Parking{
	 
 }
 class FourWheeler {
	 
 }