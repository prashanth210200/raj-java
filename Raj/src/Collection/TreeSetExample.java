
package Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numeric number or no : ");
    while(true) {
    	String userInput=sc.next();
    	if(userInput.equalsIgnoreCase("no")) {
    		break;
    		   		
    	}
    	try {
    		int value=Integer.parseInt(userInput);
        	al.add(value);
    	}
    	catch(NumberFormatException e)
    	{
    		System.out.println("Invalid input please enter the number or no : ");
    	}
    	
    }
    TreeSet<Integer> ts=new TreeSet<>(al);
    System.out.println(ts);
    
    }
    
    }
        