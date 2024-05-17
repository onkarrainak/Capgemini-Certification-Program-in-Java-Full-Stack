package onkar.Day4_core_java;

import java.util.Scanner;

public class RelationalOperation {

	public static void main(String args[]) {
		int num1;
		int num2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the num1 and num2");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		if (num1 < num2) {
			System.out.println("num1 is less then num2 ");
		} else if (num1 > num2) {
			System.out.println("num1 is greater then num2");
		}

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		if (num1 != num2) {
			System.out.println("num1 is not equals to num2");
		} else if (num1 == num2) {
			System.out.println("num1 is equals to num2");
		}
	}

}
