package onkar.Core_Java_Java8;

import java.util.function.IntBinaryOperator;

public class LargestElement {
    public static void main(String[] args) {
        IntBinaryOperator maxOperator = (a, b) -> a > b ? a : b;

        int[] array = {1, 8, 7, 56, 90, 4, 23};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = maxOperator.applyAsInt(max, array[i]);
        }
        
        System.out.println("Largest element is: " + max);
    }
}
