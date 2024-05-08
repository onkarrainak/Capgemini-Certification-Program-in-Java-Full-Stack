package onkar.Day3;


class LocalVariables {
	public void studentMarks(){
		int marks = 550;                  // Local variable
		System.out.println(marks);
	}
	public static void main(String args[]) {
		LocalVariables  mark = new LocalVariables();
		mark.studentMarks();             // Local variable
	}

}
