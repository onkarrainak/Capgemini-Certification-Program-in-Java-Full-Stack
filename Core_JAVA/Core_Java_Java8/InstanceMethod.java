package onkar.Core_Java_Java8;

class InstanceMethod {
    private int value;

    // Constructor to initialize the instance variable 'value'
    public InstanceMethod(int value) {
        this.value = value;
    }

    // Instance method that adds the given argument 'x' to the instance variable 'value'
    public int instanceMethod(int x) {
        return this.value + x;
    }

    public static void main(String[] args) {
        // Create an instance of MyClass with 'value' set to 10
    	InstanceMethod obj = new InstanceMethod(10);

        // Using a lambda expression to call the instance method
        // This lambda expression takes an integer 'x' and calls 'obj.instanceMethod(x)'
        MyInterface lambdaExpression = (x) -> obj.instanceMethod(x);

        // Call the lambda expression with the argument 5
        // This should call 'obj.instanceMethod(5)' and return 15
        int result = lambdaExpression.apply(5);
        System.out.println(result); // Output: 15

        // Using a method reference to call the instance method
        // This is a shorthand for the lambda expression and directly refers to 'obj.instanceMethod'
        MyInterface methodReference = obj::instanceMethod;

        // Call the method reference with the argument 5
        // This should also call 'obj.instanceMethod(5)' and return 15
        int result2 = methodReference.apply(5);
        System.out.println(result2); // Output: 15
    }
}

// Functional interface with a single abstract method 'apply'
@FunctionalInterface
interface MyInterface {
    int apply(int x);
}
