package CharsMethod;

public class ReverseStringWords {
    public static void main(String[] args) {
    	
		String a="I am Studying In OneSoft";
		String []s=a.split(" ");
		String rev="";
		
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";
		}
		System.out.println(rev);
	}
}

