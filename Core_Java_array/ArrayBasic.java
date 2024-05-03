package onkar.Core_Java_array;

public class ArrayBasic {
	public static void main(String args[]) {
		System.out.println("String Array :");
		String str[] = { "ONKAR", "rAINAK", "KOLHAPUR" };
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		for (String str1 : str) {
			System.out.println(str1);
		}

	}

}
