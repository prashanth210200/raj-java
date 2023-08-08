package CharsMethod;

public class Remove_RepeatedString_words {
    public static void main(String[] args) {
		String a="This is me and This is my House".toLowerCase();
		int count=1;
		String ans[]=a.split(" ");
	  for(int i=0;i<ans.length;i++) {
		  for(int j=i+1;j<ans.length;j++) {
			  if(ans[i].equals(ans[j])) {
				  count++;
				  ans[i]="";
				  ans[j]="";
			  }
			 
				 }
		  if(count>1) {
				 System.out.print(ans[i]+" ");
			 }
			

		 


	  }
    }}
   	