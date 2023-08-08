package CharsMethod;

public class AccendingString {
	public static void main(String[] args) {
		String a="abdecf";
		char c[]=a.toCharArray();
		char temp;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
			if(c[i]<c[j]) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
		}
		for(int i=0;i<a.length();i++) {
		System.out.print(c[i]);
	}
		
		
//	 Arrays.sort(c);
//		System.out.println(c);
    }
}


