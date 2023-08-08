package CharsMethod;

public class ArraytoSingleValue {
    public static void main(String[] args) {
		int a[]= {23,34,43,3};
		
        String res="";
    
    
//     StringBuffer s=new StringBuffer();
//   for(int i:a) {
//   	s.append(i);
//   }
//   String ans=s.toString();
//   System.out.println(ans);
    
    
    
		for(int i=0;i<a.length;i++) {
			res=res+a[i];
		}
			System.out.println(res);
    }
}
