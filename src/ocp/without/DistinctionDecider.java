package ocp.without;

import java.util.Arrays;
import java.util.List;

public class DistinctionDecider {
    private List<String> science = Arrays.asList("Computer Science", "Physics");
    private List<String> arts = Arrays.asList("History", "English");

    public void evaluateDistinction(Student student) {
        // Evaluate distinction for Science students
        if(science.contains(student.department)) {
            if(student.score > 80) {
                System.out.println("Student[" + student.name +
                        ", " + student.id +
                        ", " + student.department +
                        ", " + student.score +
                        "] has received a distinction in science");
            }
        }

        // Evaluate distinction for Arts students
        if(arts.contains(student.department)) {
            if(student.score > 70) {
                System.out.println("Student[" + student.name +
                        ", " + student.id +
                        ", " + student.department +
                        ", " + student.score +
                        "] has received a distinction in arts");
            }
        }
    }
}
