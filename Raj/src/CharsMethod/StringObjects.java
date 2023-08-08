package CharsMethod;

public class StringObjects {

	public static void main(String[] args) {
		String a1 = "Raj";
		String b = "Raj";
		String c = new String("Raj");// Totally two objects are created
		System.out.println(a1 == b);// Compare the memory of the String
		System.out.println(a1 == c);
		System.out.println(a1.equals(b));// Compare the value of the String
		System.out.println(a1.equals(c));

		String a = "1,2,3,1,2,3,4";
		String[] numbers = a.split(",");

		StringBuilder output = new StringBuilder();

		for (String number : numbers) {
			int num = Integer.parseInt(number);
			output.append(num * 111).append(",");
		}

		// Remove the trailing comma
		output.deleteCharAt(output.length() - 1);

		System.out.println(output.toString());

	}

}
