package onkar.Core_Java_OOPS_AccessModifiers; // package declaration

public class AnotherClass extends Example {
	public static void main(String[] args) {
        AnotherClass anotherObject = new AnotherClass();

        // Accessing methods of AnotherClass which in turn accesses methods of Example class
        anotherObject.accessMethods();
    }

 public void accessMethods() {
     // Accessing public method from parent class
     publicMethod();

     // Accessing protected method from parent class
     protectedMethod();

     // Private member variable is not accessible in the subclass
     // System.out.println(privateVar); // This would cause a compilation error

     // Accessing default access method from parent class
     defaultMethod();
 }
}
