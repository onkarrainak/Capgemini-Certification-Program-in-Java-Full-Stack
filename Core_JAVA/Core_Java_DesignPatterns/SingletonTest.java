package onkar.Core_Java_DesignPatterns;

//Test class to demonstrate Singleton in a multi-threaded environment
public class SingletonTest  {
 public static void main(String[] args) {
     // Create multiple threads to test the Singleton implementation
     Thread thread1 = new Thread(new Runnable() {
         @Override
         public void run() {
             Singleton singleton = Singleton.getInstance();
             singleton.doSomething();
         }
     });

     Thread thread2 = new Thread(new Runnable() {
         @Override
         public void run() {
             Singleton singleton = Singleton.getInstance();
             singleton.doSomething();
         }
     });

     // Start the threads
     thread1.start();
     thread2.start();

     // Wait for threads to finish
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}