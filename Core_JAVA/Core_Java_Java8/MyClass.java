package onkar.Core_Java_Java8;

import java.util.function.Function;

class MyClass {
    private int value;

    // Constructor to initialize the instance variable 'value'
    public MyClass(int value) {
        this.value = value;
    }

    // Getter method to access the value
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Function<Integer, MyClass> constructorReference = MyClass::new;

        // Call the constructor reference with the argument 10
        MyClass instance2 = constructorReference.apply(10);
        System.out.println(instance2.getValue()); 
    }
}







