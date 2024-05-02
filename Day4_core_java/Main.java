package onkar.Day4_core_java;

public class Main {
	public static void main(int[] args) {
		// Check if there are any arguments passed
		if (args.length == 0) {
			System.out.println("No arguments passed.");
		} else {
			System.out.println("Arguments passed:");
			// Print each argument
			for (int i = 0; i < args.length; i++) {
				System.out.println("Argument " + (i + 1) + ": " + args[i]);
			}
		}
	}
}