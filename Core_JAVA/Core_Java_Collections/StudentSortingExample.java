package onkar.Core_Java_Collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;

class Student1 implements Comparable<Student1> {
    private String name;
    private int rollNumber;
    private String subject;

    public Student1(String name, int rollNumber, String subject) {
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
    public int compareTo(Student1 other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Subject: " + subject;
    }
}

public class StudentSortingExample {
    public static void main(String[] args) {
        // Sample array of students
        Student1[] studentsArray = {
                new Student1("John", 105, "Math"),
                new Student1("Alice", 102, "Physics"),
                new Student1("Bob", 105, "Chemistry"),
                new Student1("Eve", 103, "Biology"),
                new Student1("Charlie", 104, "History")
        };

        // Sort the array by roll number
        sortStudentsByRollNumber(studentsArray);

        // Print the sorted array
        System.out.println("Sorted Students by Roll Number:");
        for (Student1 student : studentsArray) {
            System.out.println(student);
        }
    }

    // Method to sort an array of students by roll number
    public static void sortStudentsByRollNumber(Student1[] students) {
        // Sort the array using Arrays.sort() which internally uses Comparable interface
        Arrays.sort(students);
    }
}
