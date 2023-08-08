package MethodReference;
//13.0
import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;
import java.util.stream.Collectors;

public class Java8vsJava7Example1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Raj","Saranya","Raj","Rishi","Yazhini");
		//Before java8
		List<String>uniqueList=new ArrayList<String>();
		for(String name:names) {
			if(!uniqueList.contains(name))
				uniqueList.add(name);
		}
		System.out.println("Before Java8 :"+uniqueList);
		//In java8
		List<String>uniqueList1=names.stream()
				.distinct() //remove the duplicate value
				.collect(Collectors.toList());
		System.out.println("In Java8 :"+uniqueList1);
		
		}

}
