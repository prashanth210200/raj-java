package CharsMethod;

public class Repeated_Array_Count {
    public static void main(String[] args) {
    	int a[]= {32,43,122,12,32,23};

    	for(int i=0;i<a.length;i++) {
    		int count=1;
    		if(a[i]!=-1) {
    			
    		for(int j=i+1;j<a.length;j++) {	

    			if(a[i]==a[j]&&a[j]!=-1) {
    				count++;
    				a[j]=-1;
    			}
    				
    			}
    		System.out.println(a[i]+"-"+count);
    			
    		}
    	}
//		
//		
		
    }

   

   
}

