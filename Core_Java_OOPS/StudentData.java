package onkar.Core_Java_OOPS;

import java.util.Scanner;

public class StudentData {
	
	int sid;
    String name;
    float mark;
    
    public StudentData(int sid, String name, float mark ) {
    	
    	this.sid = 1001;
    	this.name = "onkar";
    	this.mark = 380;
    }    
    
    public StudentData() {
    	sid = 1002;
    	name = "Omu";
    	mark = 350;
		
	}
    public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public void displayStudent()
    {
        System.out.println("\n****************************");
        System.out.println(sid);
        System.out.println(name);
        System.out.println(mark);

    }
	public static void main(String args[]) {
		StudentData s1 = new StudentData(1001,"onkar",350);
	     StudentData s2 = new StudentData();
	       
	        s1.displayStudent();
	        s2.displayStudent();
	     
		
	}

}



