package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<>();

		hm.put(101,"Raj");
		hm.put(102,"Rishi");
		hm.put(103,"Saranya");
		hm.put(104,"Yazhini");
		hm.put(105,"Rudhran");
		hm.put(106,"Siva");
		
		HashMap<Integer,String> hm1=new HashMap<>();
		hm1.put(107, "Sruthi");
		hm1.put(108, "Swathi");
		hm1.put(109, "Sunil");
		
		HashMap<Integer,String> hm2=new HashMap<>(hm);
		hm2.putAll(hm1);
		System.out.println(hm2);
		
		hm.put(105, "Sidharth");
		System.out.println(hm);
		
		Set s=hm.entrySet();
		System.out.println(s);
		System.out.println(hm.keySet());
		Collection c=hm.values();
		System.out.println(c);
		System.out.println(hm.get(101));
		System.out.println(hm.get("Siva"));//con't get using value
		System.out.println(hm.containsKey(107));
		System.out.println(hm.containsValue("Rishi"));
		System.out.println(hm.remove(106));
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}

}
