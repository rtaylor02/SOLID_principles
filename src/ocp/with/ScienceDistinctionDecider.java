package ocp.with;

public class ScienceDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student s) {
        if(s.score > 80) {
            System.out.println("Student[" + s.name +
                    ", " + s.id +
                    ", " + s.department +
                    ", " + s.score +
                    "] has received a distinction in Science");
        }
    }
}
