package CharsMethod;

public class String_Calculation {
    public static void main(String[] args) {
		String a="3*3-6";
		String num[]=a.split("[*+-]");
		String cha[]=a.split("[1-9]");
		
		//the below condition is return as a String so , we need to convert String to int
		
		int result=Integer.parseInt(num[0]);
		
		for(int i=1;i<num.length;i++) {
			
			int number=Integer.parseInt(num[i]);
			char ch=cha[i].charAt(0);
			
			if(ch=='+') {
				result=number+result;
			}
			if(ch=='-') {
				result=number-result;
			}
			if(ch=='*') {
				result=number*result;
			}
		}
		System.out.println(result);
	}
}

