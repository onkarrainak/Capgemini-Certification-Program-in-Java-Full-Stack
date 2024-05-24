package onkar.Core_Java_Java8;

@FunctionalInterface
interface MyFunction {
    int apply(int param1, int param2);
}

@FunctionalInterface
interface MyConsumer<T> {
    void accept(T t);
}

@FunctionalInterface
interface MyFunction1 {
    int apply(int param);
}

@FunctionalInterface
interface MyBiFunction {
    int apply(int param1, int param2);
}

@FunctionalInterface
interface MySupplier {
    int get();
}

@FunctionalInterface
interface MyRunnable {
    void run();
}


public class BasicLambdaExpression {
    public static void main(String[] args) {
        MyFunction customFunction = (int param1, int param2) -> {
            //**** Multiple parameters and multiple lines in the body ****
            int result = param1 * param2;
            System.out.println("Result: " + result);
            return 0;
        };
        
        // Call the lambda expression
        System.out.println(customFunction.apply(5, 3)); 
        
        MyConsumer<String> myConsumer = (String parameter) -> {
            // Multiple lines in the body
            System.out.println("Statement 1 with parameter: " + parameter);
            System.out.println("Statement 2 with parameter: " + parameter);
        };

        // Call the lambda expression
        myConsumer.accept("Hello");
        
        
        MyFunction1 lambda = parameter -> parameter * parameter;
        
        // Call the lambda expression
        System.out.println(lambda.apply(5)); 
        
        
        MyBiFunction lambda1 = (param1, param2) -> param1 * param2;
        
        // Call the lambda expression
        System.out.println(lambda1.apply(5, 3));
        
        MySupplier lambda2 = () -> 42;
        
        // Call the lambda expression
        System.out.println(lambda2.get());
        
        MyRunnable lambda3 = () -> {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
        };
        
        // Call the lambda expression
        lambda3.run();
    }
}
