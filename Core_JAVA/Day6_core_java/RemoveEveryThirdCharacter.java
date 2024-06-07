package onkar.Day6_core_java;

import java.util.Scanner;

public class RemoveEveryThirdCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Get the result of the processing
        String result = removeEveryThirdCharacter(input);

        // Print the result
        System.out.println(result);

        scanner.close();
    }

    // Function to remove every third character from the input string
    public static String removeEveryThirdCharacter(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();

        // Iterate over the characters of the string
        for (int i = 0; i < length; i++) {
            // Skip every third character (index + 1 % 3 == 0)
            if ((i + 1) % 2 != 0) {
                result.append(input.charAt(i));
            }
        }

        // Convert the result to a string and return
        return result.toString();
    }
}
