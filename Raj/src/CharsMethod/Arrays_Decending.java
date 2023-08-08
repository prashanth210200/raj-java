package CharsMethod;

import java.util.Arrays;

public class Arrays_Decending {
    public static void main(String[] args) {
		String a="1,2,3,1,2,3";
		String spit[]=a.split(",");
		 int num[]=new int[spit.length];
		for(int i=0;i<spit.length;i++) {
                num[i]=Integer.parseInt(spit[i]);
               
			}
		for(int i=0;i<num.length;i++) {
			Arrays.sort(num);
			System.out.println(num[i]);
		}
		
		
	}
}
