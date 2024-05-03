package onkar.Core_Java_array;

import java.util.Scanner;

public class Mul2Darray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int a[][] = new int[size][size];
		int b[][] = new int[size][size];
		int c[][] = new int[size][size];
		;
		// String names[];
		System.out.println("Enter Elements for A matrix : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Elements for B matrix : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Elements for c matrix : ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					c[i][j] += a[k][j] * b[k][j];
				}
			}
		}
		System.out.println("Matrix after addition:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
