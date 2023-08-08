package CharsMethod;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PanagramChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String str = scanner.nextLine();
		scanner.close();

		boolean isPanagram = checkPanagram(str);
		if (isPanagram) {
			System.out.println("It's a panagram!");
		} else {
			System.out.println("It's not a panagram.");
		}
	}

	public static boolean checkPanagram(String str) {

		String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

		Set<Character> letterSet = new HashSet<>();

		for (char letter : cleanedStr.toCharArray()) {
			letterSet.add(letter);
		}

		return letterSet.size() == 26;
	}
}
