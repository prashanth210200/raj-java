package CharsMethod;

public class Pre_Post_Increment_Decreament {
    public static void main(String[] args) {
		int a=10;
		int b=a++ + ++a - --a +a++;
		System.out.println(b);
	}
}