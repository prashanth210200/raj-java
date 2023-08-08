package CharsMethod;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {

	public static void main(String[] args) {
		String a="onesofttechnologies";
		char[] b=a.toCharArray();
		HashMap<Character,Integer> dup=new HashMap<>();
		for(Character c:b) {
			if(dup.containsKey(c)) {
				dup.put(c,dup.get(c)+1);
			} else {
				dup.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer>num:dup.entrySet()) {
			if(num.getValue()>1) {
				System.out.println(num.getKey()+" count-"+num.getValue());
			} else {
				System.out.println(num.getKey());
			}
		}
				

	}

}
