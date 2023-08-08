package CharsMethod;

public class Secong_Largest_In_Array {
    public static void main(String[] args) {
		int a[]= {60,56,2,76,34,};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
			}
			} 
				
		System.out.println(a[a.length-2]);
		
	}
}
