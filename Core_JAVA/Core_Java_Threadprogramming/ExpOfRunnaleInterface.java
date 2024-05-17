package onkar.Core_Java_Threadprogramming;

class ThreadOne implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

	}

}

public class ExpOfRunnaleInterface {
	public static void main(String args[]) {
		ThreadOne t1 = new ThreadOne();
		Thread t2 = new Thread(t1);
		t2.start();

	}

}
