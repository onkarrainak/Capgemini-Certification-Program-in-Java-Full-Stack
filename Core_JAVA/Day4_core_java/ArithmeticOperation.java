
package onkar.Day4_core_java;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		int num1;
		int num2;

		System.out.println("Arithmetic Operation");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num1 and num2");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		int add, sub, mul, div, mod;
		add = (num1 + num2);
		System.out.println("addition  " + add);

		sub = (num1 - num2);
		System.out.println("Subtraction " + sub);

		mul = (num1 * num2);
		System.out.println("Multiplication " + mul);

		div = (num1 / num2);
		System.out.println("Division " + div);

		mod = (num1 % num2);
		System.out.println("modulus " + mod);

	}

}
