package onkar.Day4_core_java;

public class TernaryOperator {
	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 5;
		int num3 = 10;
		int temp;
		temp = num1 > num2 ? num1 : num2;
		int result;
		result = (num3 > temp) ? num3 : temp;
		System.out.println("Largest Number is:" + result);
	}

}
