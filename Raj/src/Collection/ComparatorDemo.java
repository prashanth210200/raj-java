package Collection;

import java.util.Comparator;

/* both are used to compare the object
 * Comparable:								Comparator:
 * -> Single sorting sequence				multiple sorting sequence
 * -> compareto()							compare(), equals().
 * -> collections.sort(List)				collections.sort(List,comparator)
 * -> default sorting						customized sorting
 * -> return integer only					return string & integer.
 */

public class ComparatorDemo implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		/*if(s1.length()>s2.length())
			return +1;
		else if(s1.length()<s2.length())
			return -1;
		
		else 
			return 0;*/
		int result =s1.compareTo(s2);//using compareTo method
		
		
		if(result>0)
			return -1;
		else if(result<0)
			return 1;
		else 
			return 0;
	}

}
