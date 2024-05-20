package onkar.Core_Java_Java8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String st = sc.nextLine();
        
        LocalDate Dob;
        Dob = LocalDate.parse(st);
        
        
        System.out.println("Age is(in years) : "+calcAge(Dob));
        
    }
    
    static int calcAge(LocalDate st)
    {
        LocalDate currentDate = LocalDate.now();
        int ageyears = Period.between(st,currentDate).getYears();
        int agemonth = Period.between(st,currentDate).getMonths();
        int agedays = Period.between(st, currentDate).getDays();
        System.out.println("Days: "+agedays);
         System.out.println("Month: "+agemonth);
        System.out.println("Years: " +ageyears);
		return ageyears;
		
        
    }

}
