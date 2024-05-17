package onkar.Day5_core_java;

public class exp_String {
	public static void main(String args[]) {
		String fname = "onkar";
		String lname = " Rainak";
		char result = fname.charAt(2);
		System.out.println(result);
		String fullName = fname.concat(lname);
		System.out.println(fullName);
		result = fullName.charAt(6);
		System.out.println(result);
		System.out.println("End with is "+ fullName.endsWith("On"));
		System.out.println("End with is " + fullName.endsWith("k"));
		System.out.println("Start with is " + fullName.startsWith("On"));
		System.out.println("Start with is " + fullName.startsWith("k"));		
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.toUpperCase());

	}

}
