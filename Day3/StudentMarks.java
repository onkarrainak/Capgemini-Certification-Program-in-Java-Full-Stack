package onkar.Day3;


class SubjectMarks{
	// These variables are instance variables, defined in class. 
		int ScienceMarks;
		int MathsMarks;
		int GKMarks;
		
		public static String subjectName = "java";       // static variable
}

public class StudentMarks {
	public static void main(String[] args) {
		SubjectMarks stud1 = new SubjectMarks();
		stud1.ScienceMarks = 80;
		stud1.MathsMarks = 95;
		stud1.GKMarks = 85;
		
		SubjectMarks stud2 = new SubjectMarks();
		stud2.ScienceMarks = 95;
		stud2.MathsMarks = 80;
		stud2.GKMarks = 75;
		
		
		// displaying marks for Student 1
		System.out.println("Marks for first object:");
		System.out.println(stud1.ScienceMarks);
		System.out.println(stud1.MathsMarks);
		System.out.println(stud1.GKMarks);
		
		System.out.println(SubjectMarks.subjectName);
		
		
		
		// displaying marks for Student 2
		System.out.println("Marks for second object:");
		System.out.println(stud2.ScienceMarks);
		System.out.println(stud2.MathsMarks);
		System.out.println(stud2.GKMarks);
		
		System.out.println(SubjectMarks.subjectName);

	}

}
