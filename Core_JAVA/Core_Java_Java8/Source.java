package onkar.Core_Java_Java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class Source {

    // Public method to find the largest element in an array using a lambda expression
    public int getLargestElement(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        // Use IntStream to find the largest element
        OptionalInt largest = Arrays.stream(arr).max();
        
        // Return the largest element if present, otherwise throw an exception
        return largest.orElseThrow(() -> new IllegalArgumentException("Array must not be empty."));
    }

    public static void main(String[] args) {
        Source source = new Source();
        int[] array = {1, 8, 7, 56, 90, 4, 23};

        try {
            int largest = source.getLargestElement(array);
            System.out.println("The largest element is: " + largest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
