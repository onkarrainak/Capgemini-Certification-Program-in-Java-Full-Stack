package onkar.Core_Java_Threadprogramming;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        // Creating two objects
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        
        // Assigning obj1 to null
//        obj1 = null;
        
        // Requesting JVM to run garbage collector
        System.gc();
        
        // Printing a message
        System.out.println("Garbage Collection in Java example");
    }
    
    // Overriding finalize() method to see if it's called
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collection performed by JVM");
    }
}
