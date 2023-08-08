
package Collection;
// Include collection Generics

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringMapDemo {

	public static void main(String[] args) {
		
		String s="rajsaranya";
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		System.out.println(charCountMap);
		char[] ch=s.toCharArray(); 
		for(char c:ch) { //for( String stringCountMap:sentence.split(" ") )
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else 
			{
				charCountMap.put(c,1);
			}
			
		}
		System.out.println(charCountMap);
		
		Set<Map.Entry<Character,Integer>> se=charCountMap.entrySet();
		
		for(Map.Entry<Character,Integer>entry:se)
		{
			if(entry.getValue()==2)
				System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
	}

}
