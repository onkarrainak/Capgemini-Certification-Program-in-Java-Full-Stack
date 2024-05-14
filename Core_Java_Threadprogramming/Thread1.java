package onkar.Core_Java_Threadprogramming;

class EvenOdd extends Thread {
	public void run() {
//		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
//		int number = scanner.nextInt();
		int number = 55;
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
		} else {
			System.out.println(number + " is odd.");
		}
//		scanner.close();
		
	}
}

class multiplicationTable {
	public void run() {
		int size = 10;
		for (int i = 1; i <= size; i++){
			int mul = size * i;
			System.out.printf(i + " * " + size + " = "+mul);
			System.out.println();
		}

	}
}

public class Thread1 {
	public static void main(String args[]) {
		EvenOdd t1 = new EvenOdd();
		t1.start();
		multiplicationTable t2 = new multiplicationTable();
		t2.run();
	}

}
