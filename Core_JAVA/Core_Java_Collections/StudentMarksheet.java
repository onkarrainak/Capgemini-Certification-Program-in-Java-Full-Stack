// package onkar.Core_Java_Collections;
import java.util.*;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheet");
            System.out.println("3. Display Average Marks");
            System.out.println("4. Display Top Performer");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(scanner, students);
                    break;
                case 2:
                    displayMarksheet(students);
                    break;
                case 3:
                    displayAverageMarks(students);
                    break;
                case 4:
                    displayTopPerformer(students);
                    break;
                case 5:
                    removeStudent(scanner, students);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent(Scanner scanner, List<Student> students) {
        System.out.println("\nEnter student details:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Maths Marks: ");
        double mathsMarks = scanner.nextDouble();
        System.out.print("Science Marks: ");
        double scienceMarks = scanner.nextDouble();
        System.out.print("English Marks: ");
        double englishMarks = scanner.nextDouble();

        students.add(new Student(name, mathsMarks, scienceMarks, englishMarks));
        System.out.println("Student added successfully!");
    }

    private static void displayMarksheet(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }

        System.out.println("\nStudent Marksheet:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n", "Name", "Maths", "Science", "English", "Total");

        for (Student student : students) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10.2f%n", student.getName(),
                    student.getMathsMarks(), student.getScienceMarks(), student.getEnglishMarks(),
                    student.getTotalMarks());
        }
    }

    private static void displayAverageMarks(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }

        double totalMaths = 0, totalScience = 0, totalEnglish = 0;
        for (Student student : students) {
            totalMaths += student.getMathsMarks();
            totalScience += student.getScienceMarks();
            totalEnglish += student.getEnglishMarks();
        }

        double avgMaths = totalMaths / students.size();
        double avgScience = totalScience / students.size();
        double avgEnglish = totalEnglish / students.size();

        System.out.println("\nAverage Marks:");
        System.out.printf("Maths: %.2f%n", avgMaths);
        System.out.printf("Science: %.2f%n", avgScience);
        System.out.printf("English: %.2f%n", avgEnglish);
    }

    private static void displayTopPerformer(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = student;
            }
        }

        System.out.println("\nTop Performer:");
        System.out.println("Name: " + topStudent.getName());
        System.out.println("Total Marks: " + topStudent.getTotalMarks());
    }

    private static void removeStudent(Scanner scanner, List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
            return;
        }

        System.out.print("Enter student name to remove: ");
        String nameToRemove = scanner.next();

        boolean found = false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equalsIgnoreCase(nameToRemove)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}

class Student {
    private String name;
    private double mathsMarks;
    private double scienceMarks;
    private double englishMarks;

    public Student(String name, double mathsMarks, double scienceMarks, double englishMarks) {
        this.name = name;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
    }

    public String getName() {
        return name;
    }

    public double getMathsMarks() {
        return mathsMarks;
    }

    public double getScienceMarks() {
        return scienceMarks;
    }

    public double getEnglishMarks() {
        return englishMarks;
    }

    public double getTotalMarks() {
        return mathsMarks + scienceMarks + englishMarks;
    }
}
