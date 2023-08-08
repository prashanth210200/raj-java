package CharsMethod;

import java.util.Arrays;

public class Array_Same_Or_Not {
    public static void main(String[] args) {
		int a[] ={1,2,3,4};
		int b[]= {4,1,3,2};
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b)) {
			System.out.println("Arrays Are Equals");
		}
		else 
			System.out.println("Arrays Are Not Equals");
}
}
