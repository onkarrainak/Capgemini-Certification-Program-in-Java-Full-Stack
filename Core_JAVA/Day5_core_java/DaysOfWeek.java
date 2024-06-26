package onkar.Day5_core_java;

public class DaysOfWeek  {
	
	public enum Days_Of_Week {
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday,
		Sunday,
	}

	public static void main(String[] args) {
		Days_Of_Week today = Days_Of_Week .Monday;
	    System.out.println("Today is " + today);
	}

}
