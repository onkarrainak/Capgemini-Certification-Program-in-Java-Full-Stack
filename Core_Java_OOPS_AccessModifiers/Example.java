// File: Example.java

package onkar.Core_Java_OOPS_AccessModifiers; // package declaration

// Public class can be accessed from anywhere
public class Example {
    
    // Private variable can only be accessed within the same class
    private int privateVar = 10;

    // Public method can be accessed from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Protected method can be accessed within the same package or by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default access method can be accessed only within the same package
    void defaultMethod() {
        System.out.println("This is a default access method.");
    }
}
