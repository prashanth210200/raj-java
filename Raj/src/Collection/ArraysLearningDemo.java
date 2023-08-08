package Collection;

import java.util.Arrays;//method overloading
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysLearningDemo {

	public static void main(String[] args) {
		int[] arr= {5,3,8,48,95};
		int[] a= {3,4,89,90,45};
		
		 Integer[] integerArray = {1, 2, 3, 4, 5};

	        // Convert the array to a list
	        // (The Arrays.asList() method returns a fixed-size list backed by the specified array)
	        java.util.List<Integer> list = Arrays.asList(integerArray);

	        // Reverse the list using the Collections.reverse() method
	        Collections.reverse(list);

	        // Convert the list back to an array (if needed)
	        Integer[] reversedArray = list.toArray(new Integer[0]);

	        // The original array is now reversed
	        System.out.println(Arrays.toString(reversedArray)); 
		
		
		System.out.println(Arrays.equals(arr, a)); //equals methods using integer.
		for(int i:arr)
			System.out.println(i);
		
		Arrays.sort(arr);//sort method using integer
	System.out.println("After sorting : ");
	for(int i:arr)
		System.out.println(i*2);
	
	String[] names= {"Raj","Saranya","Rishi","Sidharth","Yazhinini"};
	System.out.println("Before sorting : ");
			for(String s:names)
				System.out.println(s);
			
			Arrays.sort(names);// sort method using String
			System.out.println("After sorting : ");
			for(String s:names)
				System.out.println(s);
			
			//Dynamic binding
			
			Comparator comp= new ComparatorDemo();
	
			Arrays.sort(names,comp);// compare two strings
			System.out.println("After compare method : ");
			for(String s:names)
				System.out.println(s);
	}
				
		

	}


