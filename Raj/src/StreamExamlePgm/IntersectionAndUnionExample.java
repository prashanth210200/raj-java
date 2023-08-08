
package StreamExamlePgm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionAndUnionExample {

	public static void main(String args[]) {
		int arr1[] = { 80, 10, 15, 2, 35, 60 };
		int arr2[] = { 35, 80, 40, 2, 65, 74 };

		printIntersection(arr1, arr2);
		printUnion(arr1, arr2);

	}

	public static void printUnion(int arr1[], int arr2[]) {

		Set<Integer> s = new LinkedHashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++)

		{
			s.add(arr2[i]);
		}
		System.out.println("Union: ");
		System.out.println(s);
	}

	// find intersection
	public static void printIntersection(int arr1[], int arr2[]) {

		Set<Integer> s = new LinkedHashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {

			if (s.contains(arr2[i])) {

				System.out.println(arr2[i] + " ");
			}
		}

	}
}
