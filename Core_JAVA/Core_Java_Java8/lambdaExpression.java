package onkar.Core_Java_Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class lambdaExpression {
    public static void main(String[] args) {
    	
//    	Basic Addition
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));  
        
//      Squaring a Number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(4));
        
//      Checking Even Number
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(10));
        
//      String Concatenation
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("Hello, ", "world!")); 
        
//      Finding the Maximum of Two Numbers
        BiFunction<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;
        System.out.println(max.apply(7, 3)); 
        
//      Sorting a List of Strings
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        list.forEach(System.out::println);
    }
}
