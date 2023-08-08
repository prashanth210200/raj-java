package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
/*
 *  Supplier:
 *  Supplier can be used in all contexts where there is no input but an output is expected
 *  It use get().It have only return type , no method argument.
 *  It is string datatype.
 */

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> supplier =()-> "Hi Raj";
		System.out.println(supplier.get());
		List<String> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(()-> "Hi Rishi"));

	}

}
