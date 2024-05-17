package onkar.Day4_core_java;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String args[]) {
//		int num1;
//		int num2;
//		int num3;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the num1 num2 and num3 ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		boolean result;
		// Logical OR Operator
		result = (num1 > num2) || (num3 > num1);
		System.out.println(result);

		// Logical AND Operator
		result = (num1 > num2) && (num3 > num1);
		System.out.println(result);

	}
}
