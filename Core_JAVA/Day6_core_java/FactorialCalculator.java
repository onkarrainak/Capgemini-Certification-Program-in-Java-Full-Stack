package onkar.Day6_core_java;

import java.util.Scanner;

public class FactorialCalculator {

	  public static int calculateFactorial(int n) {
	    // Base case: factorial of 0 is 1
	    if (n == 0) {
	      return 1;
	    }
	    // Recursive case: multiply n with factorial of (n-1)
	    return n * calculateFactorial(n - 1);
	  }

	  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number :");
	    int number = sc.nextInt();
	    int number1 = sc.nextInt();
	    int factorial = calculateFactorial(number);
	    System.out.println("Factorial of " + number + " is: " + factorial);
	    
	    factorial = calculateFactorial(number1);
	    System.out.println("\nFactorial of " + number1 + " is: " + factorial);
	  }
	}
