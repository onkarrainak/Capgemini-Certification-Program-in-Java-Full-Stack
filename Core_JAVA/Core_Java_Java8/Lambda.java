package onkar.Core_Java_Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> intSeq = Arrays.asList(1, 2, 3);
//		intSeq.forEach(x -> System.out.println(x));

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((n) -> {System.out.println(n);});

	}

}
