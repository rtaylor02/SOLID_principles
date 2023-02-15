package ocp.without;

import java.util.Arrays;
import java.util.List;

public class DistinctionDecider {
    private List<String> science = Arrays.asList("Computer Science", "Physics");
    private List<String> arts = Arrays.asList("History", "English");

    public void evaluateDistinction(Student student) {
        // Evaluate distinction for Science students
        if(science.contains(student.getDepartment())) {
            if(student.getScore() > 80) {
                System.out.println("Student[" + student.getName() +
                        ", " + student.getId() +
                        ", " + student.getDepartment() +
                        ", " + student.getScore() +
                        "] has received a distinction in science");
            }
        }

        // Evaluate distinction for Arts students
        if(arts.contains(student.getDepartment())) {
            if(student.getScore() > 70) {
                System.out.println("Student[" + student.getName() +
                        ", " + student.getId() +
                        ", " + student.getDepartment() +
                        ", " + student.getScore() +
                        "] has received a distinction in arts");
            }
        }
    }
}
