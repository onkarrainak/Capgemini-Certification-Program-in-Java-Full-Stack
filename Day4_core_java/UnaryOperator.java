package onkar.Day4_core_java;

import java.util.Scanner;

public class UnaryOperator {
	public static void main(String[] args) {
		int num1;
		int num2;

		System.out.println("Unary Operator");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num1 and num2");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		System.out.println("Numbers after Incrementing ");
		num1++;
		System.out.println(" post Incrementing " + num1);

		++num1;
		System.out.println(" pre Incrementing " + num1);

		System.out.println("Numbers after Decrementing ");

		num2--;
		System.out.println(" post Decrementing " + num2);

		--num2;
		System.out.println(" pre Decrementing " + num2);

	}
}
