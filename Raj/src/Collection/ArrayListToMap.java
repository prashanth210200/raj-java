package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListToMap {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		ArrayList<Integer> all=new ArrayList<>();
		al.add(3);
		al.add(5);
		al.add(6);
		al.add(7);
		ArrayList<Integer> alll=new ArrayList<>(al);
		alll.retainAll(all);
		//System.out.println(alll);
		
		
		Set<Integer> se=new HashSet<>();
		for(Integer i:al) {
			if(se.add(i)==true)
			System.out.println(i);
		}
		
	
		ArrayList<String> str=new ArrayList<>();
		str.add("Rishi");
		str.add("Yazhini");
		str.add("Yazhini");
		str.add("Sidharth");
		
		Set<String> set=new HashSet<>();
		for(String st:str) {
			if(set.add(st)==false)
			System.out.println(st);
		}
		
	}

}
