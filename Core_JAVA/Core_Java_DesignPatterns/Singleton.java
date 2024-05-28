package onkar.Core_Java_DesignPatterns;

public class Singleton {
    // Volatile variable ensures visibility of changes across threads
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // Initialize any resources or configurations here
    }

    public static Singleton getInstance() {
        // First check (without synchronization) for performance
        if (instance == null) {
            synchronized (Singleton.class) {
                // Second check (with synchronization) to ensure only one instance is created
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate singleton behavior
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}


