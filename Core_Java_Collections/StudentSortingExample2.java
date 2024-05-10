package onkar.Core_Java_Collections;

import java.util.Arrays;

class StudentSort implements Comparable<StudentSort> {
    private String name;
    private int rollNumber;
    private String subject;

    public StudentSort(String name, int rollNumber, String subject) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public int compareTo(StudentSort other) {
        // Compare by roll number first
        int rollNumberComparison = Integer.compare(this.rollNumber, other.rollNumber);
        if (rollNumberComparison == 0) {
            // If roll numbers are equal, compare by name
            return this.name.compareTo(other.name);
        }
        return rollNumberComparison;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Subject: " + subject;
    }
}

public class StudentSortingExample2 {
    public static void main(String[] args) {
        // Sample array of students
    	StudentSort[] studentsArray = {
                new StudentSort("Onkar", 101, "Math"),
                new StudentSort("Sourabh", 102, "Physics"),
                new StudentSort("Akash", 103, "Chemistry"),
                new StudentSort("Rohit", 104, "Biology"),
                new StudentSort("Vishal", 105, "History"),
                new StudentSort("Bharat", 102, "Geography") // Testing duplicate roll numbers
        };

        // Sort the array by roll number and then by name if roll numbers are same
        sortStudentsByRollNumber(studentsArray);

        // Print the sorted array
        System.out.println("Sorted Students by Roll Number:");
        for (StudentSort student : studentsArray) {
            System.out.println(student);
        }
    }

    // Method to sort an array of students by roll number and then by name if roll numbers are same
    public static void sortStudentsByRollNumber(StudentSort[] students) {
        // Sort the array using Arrays.sort() which internally uses Comparable interface
        Arrays.sort(students);
    }
}
