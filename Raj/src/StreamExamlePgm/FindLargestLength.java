package StreamExamlePgm;


import java.util.Arrays;

public class FindLargestLength {

	public static void main(String[] args) {
		String[] str={"SpringBoot","Microservices","Java","Hibernets"};
		String str2=Arrays.stream(str).reduce((m1, m2)->m1.length()>m2.length()?m1:m2).get();
		System.out.println(str2);
		
		
		
		String str3="This is java program This is java program";
		int mid=str3.length()/2;
		String lower="";
		String upper="";
		for(int i=0;i<str3.length();i++) {
			if(i<mid) {
				lower=lower+Character.toLowerCase(str3.charAt(i));
			}
			else {
				upper=upper+Character.toUpperCase(str3.charAt(i));
			}
		}
		System.out.println(lower+upper);
				
	}

}
