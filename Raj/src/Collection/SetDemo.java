package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetDemo {
	/*
	 * HashSet                     LinkedHashSet
	 * HashTable					HashTable andLinkedList.
	 * No Insertion Order  			Insertion order maintained
	 * 
	 */

	public static void main(String[] args) {
		// no order maintains
    HashSet hs=new HashSet();
    hs.add(5);
    hs.add(56);
    hs.add(50);
    hs.add(115);
    hs.add(534);
    hs.add(58);
    hs.add(5);
    System.out.println(hs.add(10));
    System.out.println(hs.add(50));
    System.out.println(hs);
    
    LinkedList  ll=new LinkedList();
    ll.add(50);
    ll.add(56);
    ll.add(50);
    ll.add(56);
    ll.add(5);
    ll.add(58);
    ll.add(5);
    System.out.println("Before removing"+ll);
    Object[] ob=ll.toArray();//changed linkedList to Array
    for(Object o:ob)
    {
    	System.out.println(o);
    }
    
    LinkedHashSet llhs=new LinkedHashSet(ll);
    System.out.println("after removing"+llhs);
    // maintains the sorted order using balanced tree
    TreeSet ts=new TreeSet(ll);
    System.out.println("TreeSet : "+ts);
    
    //Insertion order maintained
    LinkedHashSet  lhs=new LinkedHashSet();
    lhs.add(5);
    lhs.add(56);
    lhs.add(50);
    lhs.add(115);
    lhs.add(534);
    lhs.add(58);
    lhs.add(5);
    System.out.println(lhs.add(56));
    System.out.println(lhs);
	
	}

}

