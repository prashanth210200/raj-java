package CharsMethod;

public class DuplicateInArray {
	  public static void main(String[] args) {
		  int a[]= {25,10,30,25,30};
			int count=1;
			for(int i=0;i<a.length;i++) {
				count=1;
				for(int j=i+1;j<a.length;j++) {
					
				if(a[i]==a[j]) {
					count++;
				// a[i]=a[i];
					//System.out.println(a[i]+"-"+count);
				}
				
				}
				if(count>1) {
					System.out.println(a[i]+"-"+count);
				}
				else if(count==1)
					System.out.println(a[i]+"-"+count);
				

							
		
	}
	}}

