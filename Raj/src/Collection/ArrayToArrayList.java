package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] colors= {"Red","Green","Blue"};
		List<String> str=Arrays.asList(colors);
		//System.out.println(str);
		
		List<String> list=new ArrayList<>();
		Collections.addAll(list, colors);
		//System.out.println(list);

		for(String strr:colors) {
			list.add(strr);
		}
		System.out.println(list);
	}

}
