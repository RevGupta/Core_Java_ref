package lists;

import java.util.ArrayList;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class FilterStudentsByGPA {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rob", "Smith", 3.3));
        studentList.add(new Student("Allen", "Turing", 4.0));
        studentList.add(new Student("Bob", "Marley", 3.2));
        studentList.add(new Student("Eva", "Green", 3.8));

        System.out.println("Students before filtering:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        filterStudentsByGPA(studentList);

        System.out.println("\nStudents after filtering:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private static void filterStudentsByGPA(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to filter.");
            return;
        }

        double totalGPA = 0;

        for (Student student : students) {
            totalGPA += student.getGpa();
        }

        double averageGPA = totalGPA / students.size();

        ArrayList<Student> studentsToRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getGpa() < averageGPA) {
                studentsToRemove.add(student);
            }
        }

        students.removeAll(studentsToRemove);
    }
}

