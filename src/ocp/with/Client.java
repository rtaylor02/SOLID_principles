package ocp.with;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> scienceStudents = enrollScienceStudents();
        List<Student> artsStudents = enrollArtsStudents();

        // Display students
        System.out.println("List of Enrolled Students");
        System.out.println("============================");
        for(Student s : scienceStudents) {
            System.out.println(s);
            ;
        }
        for(Student s : artsStudents) {
            System.out.println(s);
            ;
        }
        System.out.println();


        // Evaluate distinctions
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        System.out.println("Distinctions");
        System.out.println("============================");
        for(Student s : scienceStudents) {
            scienceDistinctionDecider.evaluateDistinction(s);
        }
        for(Student s : artsStudents) {
            artsDistinctionDecider.evaluateDistinction(s);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Samantha Burrows", "Computer Science", "12345", 87.5);
        Student matt = new ScienceStudent("Matthew Clarke", "Physics", "45332", 67.0);

        List<Student> students = new ArrayList<>();
        students.add(sam);
        students.add(matt);

        return students;
    }

    private static List<Student> enrollArtsStudents() {
        Student ken = new ArtsStudent("Ken Mallard", "History", "14545", 77.5);
        Student debby = new ArtsStudent("Deborah Meade", "English", "23236", 97.5);
        Student thomas = new ArtsStudent("Thomas Kent", "Sculpting", "44293", 88);

        List<Student> students = new ArrayList<>();
        students.add(ken);
        students.add(debby);
        students.add(thomas);

        return students;
    }
}
