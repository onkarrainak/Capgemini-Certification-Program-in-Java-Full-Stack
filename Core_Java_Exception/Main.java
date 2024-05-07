package onkar.Core_Java_Exception;
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Classroom {
    public String registerStudent(Student student) {
        String name = student.getName();
        int score = student.getScore();
        
        if (!name.equals(name.toUpperCase())) {
            return "Block letters needed";
        }
        
        if (score < 0 || score > 100) {
            return "Invalid score";
        }
        
        return "Registered";
    }

    public String studentCard(String card) {
        if (!card.matches("[0-9]+")) {
            return "Invalid card";
        }
        
        return "Valid card";
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("JOHN DOE", 85);
        Student student2 = new Student("Jane Smith", 105);
        Student student3 = new Student("ALICE", -5);
        
        Classroom classroom = new Classroom();
        
        System.out.println("Student 1 registration: " + classroom.registerStudent(student1));
        System.out.println("Student 2 registration: " + classroom.registerStudent(student2));
        System.out.println("Student 3 registration: " + classroom.registerStudent(student3));
        
        System.out.println("Student card validation: " + classroom.studentCard("123456789"));
        System.out.println("Student card validation: " + classroom.studentCard("123abc456"));
    }
}
