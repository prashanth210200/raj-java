package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	/*
	 * ->It maps a key,  value pair
	 * -> When two or more keys are mapped to the same value 
	 * 	using these hashing methods and remove the duplicates
	 * -> HashMap uses the hashcode of the key's object and 
	 * 	this hashcode is further used by the hash function
	 * 	to find the Index of the bucket where the new entry can be added
	 * 	HashMap uses multiple buckets and each bucket points to a linked list.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put("Nellai Exp", 1900);
		hm.put("Manni Exp", 2000);
		hm.put("Chidamparam Exp", 2100);
		hm.put("Madurai Exp", 2100);
		System.out.println(hm);
		Set s=hm.entrySet();
		System.out.println(s);
		Iterator i= s.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			Map.Entry e=(Map.Entry)o;
			Object time=e.getValue();
			Object expName=e.getKey();
			if(time.equals(2100)) {
				System.out.println(expName);
				e.setValue(2130);
			}
			//System.out.println(e.getKey());
			//System.out.println(e.getValue());
			//System.out.println(i.next());
				
		}
		System.out.println(s);
		
	}
	
	

}
