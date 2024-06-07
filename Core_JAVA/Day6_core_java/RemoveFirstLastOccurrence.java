package onkar.Day6_core_java;

import java.util.Scanner;

public class RemoveFirstLastOccurrence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string:");
		String inputString = scanner.nextLine();

		System.out.println("Enter the character to remove:");
		char charToRemove = scanner.nextLine().charAt(0);

		String resultString = removeFirstLastOccurrence(inputString, charToRemove);

		System.out.println("Resulting string: " + resultString);

		scanner.close();
	}

	public static String removeFirstLastOccurrence(String str, char ch) {
		int firstIndex = str.indexOf(ch);
		int lastIndex = str.lastIndexOf(ch);

		// If the character is not found or found only once, return the original string
		if (firstIndex == -1 || firstIndex == lastIndex) {
			return str;
		}

		// Build the resulting string
		StringBuilder result = new StringBuilder();
		result.append(str, 0, firstIndex); // Append the part before the first occurrence
		result.append(str, firstIndex + 1, lastIndex); // Append the part between the first and last occurrence
		result.append(str, lastIndex + 1, str.length()); // Append the part after the last occurrence

		return result.toString();
	}

}