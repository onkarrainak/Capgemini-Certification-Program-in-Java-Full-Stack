package onkar.Day4_core_java;

public class BitwiseOperator {
	public static void main(String args[]) {
		int a = 50;
		int b = 20;
		int c = 0;
		c = a & b;
		System.out.println("a & b = " + c);
		c = a | b;
		System.out.println("a | b = " + c);
		c = a ^ b;
		System.out.println("a ^ b = " + c);
		c = ~a;
		System.out.println("~a = " + c);

	}

}
