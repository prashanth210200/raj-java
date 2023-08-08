package CharsMethod;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a = "Army";
		String b = "Mary";

		if (isAnagram(a, b)) {
			System.out.println("It is Anagram");
		} else
			System.out.println("Not Anagram");
	}

	public static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();

//		if (a.length() != b.length()) {
//			return false;
//		}

		char ch1[] = a.toCharArray();
		char ch2[] = b.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}

		return true;
	}
}

