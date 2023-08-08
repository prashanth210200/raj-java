package CharsMethod;

public class Palindrome {
    public static void main(String[] args) {
		String a="malayalam";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		if(rev.equals(a))
		{
			System.out.println("It Is Palindrome");
			}
		else
			System.out.println("Not Palindrome");
	}
}