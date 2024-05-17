package onkar.Day3;

class get_marks
{	
	int ScienceMarks;
	int MathsMarks;
}

public class Variables 
{
	public static void main(String args[])
	{
	 
		get_marks stu1 = new get_marks();
		stu1.ScienceMarks = 90;
		stu1.MathsMarks = 85;
		System.out.println("Student 1 mark");
		System.out.println(stu1.ScienceMarks + "  " + stu1.MathsMarks);

		get_marks stu2 = new get_marks();
		stu2.ScienceMarks = 90;
		stu2.MathsMarks = 85;
		System.out.println("Student 2 mark");
		System.out.println(stu2.ScienceMarks + "  " + stu2.MathsMarks);
	}
		
}

