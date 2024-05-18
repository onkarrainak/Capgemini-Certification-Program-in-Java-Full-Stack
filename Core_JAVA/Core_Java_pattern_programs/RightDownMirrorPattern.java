package onkar.Core_Java_pattern_programs;

public class RightDownMirrorPattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            if (i%2 ==0 ) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }
            }else {
            	for (int j = n - i; j >= 1; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}
}
