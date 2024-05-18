package onkar.Core_Java_pattern_programs;

public class PowerPatternPrograms {

	public static void main(String[] args) {
		int n = 5;
		int num = 2;
		int pnum = 2;
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {

				System.out.print(pnum);
			}
			pnum = num * i;

			System.out.println();
		}

	}

}
