package FunctionalInterface;
//28.0
/*
 * Lambda Expression:
()->{}
-> The expression through which we can represent an Anonymous function
-> Anonymous function: A method who don't have any name or modifier
-> The Lambda Expression can be only applicable  Functional Interface.
-> Used to implements the Functional Interface.
-> It takes parameters and return value
-> Not tied with classes
-> Can be assigned to a variable.

Functional Interface:
-> @FunctionalInterface
-> A functional interface is an interface that contains only one abstract method.
   before  also was there some of the predefined  functional interface. 
   
-> They can have only one functionality to exhibit
-> Lambda expressions can be used to represent the instance of a functional interface.
-> Can contain default and static methods
-> It also known as single abstract method.
	Runnable	-> run()
	Callable    -> call()
	Comparable  -> compareTo()
	Comparator  -> compare()
	
	if you want create custom functional interface , then create interface and annotate @functional Interface and there will have 
	single abstract method you have to mension. apport from this if you want to add  static or default. you can add them
	
	

*Pillers:
*->Consumer
*->Predicate
*->Function
*->Supplier
*/

public class FunctionalInterfaceTest {
	public static void main(String args[]) {
 /*Interface1 interface1=()->System.out.println("Add two value");
 interface1.add();
 interface1.methodOne();
 Interface1.methodTwo();*/
 //Interface1 interface1=(input)->System.out.println("Sum : "+input);
 //interface1.sum(23);
	Interface1 interface1=(a,b)-> a-b;
	System.out.println(interface1.subtract(3,1));
	
}
}

interface Interface1{
	//void add();
	//void sum(int input);
	int subtract(int a, int b);
	
	
	 /*default void methodOne() {
		 System.out.println("Message from default method");
	 }
	 static void methodTwo() {
		 System.out.println("Message from static method");
	 }*/
}