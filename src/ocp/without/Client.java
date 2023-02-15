package ocp.without;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> students = enrolledStudents();

        // Display students
        System.out.println("List of Enrolled Students");
        System.out.println("============================");
        for(Student s : students) {
            System.out.println(s);;
        }
        System.out.println();

        // Evaluate distinctions
        System.out.println("Distinctions");
        System.out.println("============================");
        DistinctionDecider dd = new DistinctionDecider();
        for(Student s : students) {
            dd.evaluateDistinction(s);
        }
    }

    private static List<Student> enrolledStudents() {
        Student sam = new Student("Samantha Burrows", "Computer Science", "12345", 87.5);
        Student matt = new Student("Matthew Clarke", "Physics", "45332", 67.0);
        Student ken = new Student("Ken Mallard", "History", "14545", 77.5);
        Student debby = new Student("Deborah Meade", "English", "23236", 97.5);

        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(matt);
        students.add(ken);
        students.add(debby);

        return students;
    }
}
