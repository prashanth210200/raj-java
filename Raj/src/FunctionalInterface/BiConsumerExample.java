
package FunctionalInterface;
//1.12.50
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> bc1=(x,y)->System.out.println("Add: "+(x+y));
		BiConsumer<Integer,Integer> bc2=(x,y)->System.out.println("Sub: "+(x-y));
		bc1.accept(10, 20);
		bc2.accept(10, 20);
		bc1.andThen(bc2).accept(20, 40);
		
		List<Integer> l1=Arrays.asList(1,2,3,4);
		List<Integer> l2=Arrays.asList(1,2,3,4);
		
		BiConsumer<List<Integer>, List<Integer>> sizeCheck=
				(list1,list2)->{
					if(list1.size()==list2.size())
						System.out.println("True");
					else
						System.out.println("False");
				};
				
				sizeCheck.accept(l1, l2);
	}

}
