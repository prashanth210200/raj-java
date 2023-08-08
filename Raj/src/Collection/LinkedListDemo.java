package Collection;

import java.util.LinkedList;

public class LinkedListDemo {
	
	/*
	 * LinkedList:
	 * -> Element insertion/deletion is faster
	 * -> Element retrieval is not faster
	 * -> Linked Lists are better to use for the update operations
	 * 
	 * ArrayList:
	 	 *  ArrayList is resizable
		 *  Heterogeneous objects are allowed or different types of objects are allowed
		 *  Data structure -Growable Array or dynamic array
		 *  Data Retrieval is faster
		 *  add/removel of an element at first/middle position needs more sift operations
	 * -> ArrayList are better to use for the search operations
	 *
	 * Concurrent HashMap:
	 * -> Thread safe
	 * -> Synchronized
	 * -> No lose of information
	 * -> Didn't allow the null value
	 * -> Nature of the flow fail safe
	 * -> Allow runtime modification.
	 * 
	 * HashTable:
	 * -> Not null
	 * -> allowed duplicate
	 * -> follow decending order.
	 * -> Synchronized
	 */

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.addFirst(100);
		al.addLast(200);
		LinkedList<String> as=new LinkedList<>();
		as.add("Raj");
		as.add("Saranya");
		as.add("Rishi");
		as.add("Yazhini");
		as.add("Sidharth");
		as.add("Siva");
		as.add(" ");
		as.add(null);
		System.out.println(al);
		al.addFirst(66);
		al.addLast(77);
		System.out.println(al);
		System.out.println(al.poll());
		System.out.println(al.pollFirst());
		System.out.println(al.pollLast());
		System.out.println(al);
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.removeFirst());
		System.out.println(al.removeLast());
		System.out.println(al);
		System.out.println(al.offer(2999));
		System.out.println(al.offerFirst(3000));
		System.out.println(al.offerLast(40000));
		System.out.println(al);
		LinkedList<Integer> ll=(LinkedList)al.clone();
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		//convert LinkedList to Array
		Object[] o=as.toArray();
		for(Object str:o) {
			System.out.println(str);
		}
		
		
	}

}
