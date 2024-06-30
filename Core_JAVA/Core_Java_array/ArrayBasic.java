package onkar.Core_Java_array;

public class ArrayBasic {
	public static void main(String args[]) {
		System.out.println("String Array :");
		String str[] = { "ONKAR", "RAINAK", "KOLHAPUR" };
		int i = 0;
		for ( ; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		
		
		System.out.println();
		for (String str1 : str) {
			System.out.println(str1);
		}

	}

}
