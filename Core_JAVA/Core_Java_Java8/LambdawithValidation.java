package onkar.Core_Java_Java8;

@FunctionalInterface
interface validate {
	boolean isValid(String firstName, String lastName);// only 1 abstract method
}

public class LambdawithValidation {
	boolean validate(String username, String password) {
		validate v = (s1, s2) -> {
			return (s1.equals("ABC") && s2.equals("DEF")) ? true : false;
		};
		return v.isValid(username, password);
	}

	public static void main(String[] args) {
		LambdawithValidation s = new LambdawithValidation();
		String uname = "ABC";
		String pass = "DEF";
		System.out.println(s.validate(uname, pass));
	}
}