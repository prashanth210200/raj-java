package Collection;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm=new TreeMap();
		tm.put(101,"Raj");
		tm.put(103, "Rishi");
		tm.put(102,"Raji");
		
		TreeMap tm2=new TreeMap();
		tm2.putAll(tm);
		System.out.println(tm2);
//		int k=0;
//		for(int i=0;i<100;i++) {
//			k=k++;
//		}
//		System.out.println(k);
//		System.out.println(k);
		
	}

}
