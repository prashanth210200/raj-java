package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListArray {
	
	    public static void main(String[] args) {
	        List<Integer> s = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 7);

	        Set<Integer> uniqueElements = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();

	        for (Integer num : s) {
	            if (!uniqueElements.add(num)) {
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicates: " + duplicates);
	        System.out.println("UniqueElements: " + uniqueElements);
	    }
	}


