package CharsMethod;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Array {
    public static void main(String[] args) {
  	  List<Integer>ans=new ArrayList<>();
		int a[]= {432,34,234,5,54};
		int b[]= new int[a.length];
  	  for(int i=a.length-1;i>=0;i--) {
  		  b[i]=a[i];
  		  System.out.println(b[i]);
          ans.add(b[i]);
  	  }
  	  System.out.println(ans);
	}
}
