package onkar.Day5_core_java;

import java.util.Scanner;

public class reverseString {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String reverse = revString(name);
		System.out.println(reverse);
		scanner.close();		
	}
	
	public static String revString(String name) {
		String rev = "";
		int i = name.length()-1;
		while (i >= 0) {
			rev += name.charAt(i);
			i--;			
		}
		
		return rev;
		
	}
}
