package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSortExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(29);
		list.add(89);
		list.add(24);
		list.add(23);
		list.add(9);
		list.add(2);
		//Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		list.stream().sorted().forEach(s->System.out.println(s));
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
