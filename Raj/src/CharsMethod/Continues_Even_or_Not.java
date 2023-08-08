package CharsMethod;

public class Continues_Even_or_Not {
    public static void main(String[] args) {
		int a[]= {3,88,76,4,9,8};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				count++;
			}
			else {
				count=0;
			}
		if(count==3) {
			System.out.println("True");
	        break;
		}}
		
		if(count<3||count>3) {
		System.out.println("False");
	}
		}
}

