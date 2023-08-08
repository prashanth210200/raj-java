package Collection;

import java.util.Scanner;

public class Getting_inputs {

	public static void main(String[] args) {
		//a2+b2+2ab
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 Nos:");
		a=in.nextInt();
		b=in.nextInt();
		c=a*a+b*b+2*a*b;
		System.out.println("Result:"+c);
	}

}
