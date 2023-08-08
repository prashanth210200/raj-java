package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddArrayList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2=new ArrayList<>();
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		List<Integer> concat=new ArrayList<>(list1);
		concat.addAll(list2);
		System.out.println(concat);
		
		
		List<Integer>oddNumber=Arrays.asList(1,3,5,7,7,9);
		List<Integer>evenNumber=Arrays.asList(2,4,6,8,10);
		List<Integer>evenNumber1=Arrays.asList(2,4,6,8,10,11,12,13,14,15);
		
		List<List<Integer>> listOflist=Arrays.asList(oddNumber,evenNumber,evenNumber1);
		System.out.println("Before Flatern: "+listOflist);
		
		List<Integer>flattenList=listOflist.stream()
				.flatMap(List :: stream).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Flatten List :"+flattenList);

	}

}
