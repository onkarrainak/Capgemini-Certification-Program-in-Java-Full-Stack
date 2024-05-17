package Thread;

class ThreadOne implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Thread 1 : " + i);
		}

	}
}

public class ThreadSleep {
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		// t1.run();
		Thread t = new Thread(t1);
		t.start();
	}

}
