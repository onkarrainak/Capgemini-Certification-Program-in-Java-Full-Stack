package onkar.Core_Java_Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// lambda function............
        System.out.println("lambda func.....");
        List<String> num1 = Arrays.asList("onkar","omu","rainak","sujay");
        Collections.sort(num1, (i1,i2) -> i1.compareTo(i2));
        System.out.println("lambda Sort my array.....");
        num1.forEach(l->System.out.println(l));
        //num1.forEach(System.out::println);
        System.out.println();
        
        
        //method reference..........
        System.out.println("method reference.....");
        Collections.sort(num1,(String::compareTo));
        num1.forEach(System.out::println);
        System.out.println("Normal for loop....");
        for(String arr:num1) {
            System.out.println(arr);
        }

	}

}
