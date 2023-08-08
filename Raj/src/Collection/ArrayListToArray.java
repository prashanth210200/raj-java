package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
	Integer[] arr=new Integer[al.size()];
	al.toArray(arr);
	
	for(Integer all:arr) {
		System.out.println(all);
	}
	
	}

}
