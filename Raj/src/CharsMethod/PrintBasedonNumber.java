package CharsMethod;

public class PrintBasedonNumber {
    public static void main(String[] args) {
   	 
		String a="a1b2c3";
		
		int num=0;
		int count=0;
		char c=0;
		
		
		for(int i=0;i<a.length();i++) {
			if(i%2!=0) {
				num=Integer.parseInt(Character.toString(a.charAt(i)));
			}
			else if(i%2==0) {
				c=a.charAt(i);
		}
		count++;
		
		// Because our  numerical position starting in 2nd position
		
		if(count==2) {
			for(int j=0;j<num;j++) {
				System.out.println(c);
			}
			count=0;
		}
	}
		
    }
    }
