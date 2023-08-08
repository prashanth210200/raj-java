package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/* only forward direction,no removal
cannot modify the contents of the collection.
Cursor->Useful for retrieving object one by one from collection
1. Enumeration
2. Iterator-hasnext(),next(),remove().->forward direction-Removing is possible
3. ListIterator-can move forward and backward-Bidirectional cursor-Read -Remove- replace
4. Spliteratot.-*/
public class CursersDemo {

	public static void main(String[] args) {
		//String[] s= {"Raj","Saranya","Rishi","Yazhini"};
		ArrayList names=new ArrayList();
		names.add("Raj");
		names.add("Saranya");
		names.add("Rishi");
		names.add("Yazhini");
		names.add("Sidharth");
		names.add(5);
		System.out.println(names);
		for(Object s:names)
		{
			System.out.println(s);
		}
		Iterator i=names.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			//i.remove();
		}
		
		System.out.println("Before : "+names);

	ListIterator li=names.listIterator();
	li.add("Raja");
	while(li.hasNext()) {
		if(li.next().equals(5)) {
			li.set(100);
			
		}
	}
	System.out.println(names);
	
	}
	
	

}
