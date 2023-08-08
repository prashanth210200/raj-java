package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	

	public static void main(String[] args) {
		
		HashMap hm=new HashMap();
		hm.put("Raj",101);// Stores key, value pair
		hm.put("Saranya",102);// using put method
		hm.put("Rishi",102);// duplicate key not allowed
		hm.put("Sidharth",104);
		hm.put("Yazhini",105);// Doesn't follow the insertion order.
		hm.put("Yazhini", null);//only one null key allowed
		System.out.println(hm.containsKey("Rishi"));
		System.out.println(hm.containsValue(101));
		System.out.println(hm);
		Set s=hm.keySet();//get keys
		System.out.println("Keys are: "+s);
		Collection c=hm.values();// get values
		System.out.println("Values are: "+c);
		Set s2=hm.entrySet();
		System.out.println("Entries are: "+s2);
		Iterator i=s2.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			//System.out.println(i.next());
			//System.out.println( me.getKey()+":"+me.getValue());
			if(me.getKey().equals("Saranya"))
			//System.out.println(me.getValue());
			me.setValue(200);
			System.out.println(me);
		}
		
		HashMap hm2=new HashMap();
		hm2.put(101,"Raj");// Stores key, value pair
		hm2.put(102,"Saranya");
		Set s5=hm2.entrySet();
		Iterator i1=s5.iterator();
		while(i1.hasNext())
		{
			Map.Entry me2=(Map.Entry)i1.next();
			
			if(me2.getKey().equals(101)) 
				me2.setValue("Saran");
			if(me2.getKey().equals(102)) 
				me2.setValue("Rajubhai");
			//System.out.println(me2);
			System.out.print(me2.getValue()+" ");
		}

	}

}
