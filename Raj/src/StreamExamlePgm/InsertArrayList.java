package StreamExamlePgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class InsertArrayList {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5,6};  
		System.out.println("Array:"+Arrays.toString(arr));  
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));  
		arrayList.add(7); 
		arrayList.set(3,3);
		arr = arrayList.toArray(arr);  
		System.out.println("Array after adding element: "+Arrays.toString(arr));  
		
		
		
		String[] strArray = { "Red", "Green", "Blue", "Yellow", "Violet", "Magenta", "PURPLE" }; 
		for(String c:strArray) {
			System.out.print(c.charAt(0));
		}
        
		
		System.out.println(Arrays.stream(strArray) 
                .filter(Objects::nonNull) 
                .map(s->s.charAt(0)) 
                .collect(Collectors.toList())); 
        
        
        String a="Developers Are Here";
        String b[]=a.split(" ");
        for(String s:b) {
        	System.out.print(s.charAt(0));
        	
        }
		
	}

}
