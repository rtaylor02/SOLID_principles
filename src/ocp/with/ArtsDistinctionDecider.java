package ocp.with;

public class ArtsDistinctionDecider implements DistinctionDecider {
    @Override
    public void evaluateDistinction(Student s) {
        if(s.score > 70) {
            System.out.println("Student[" + s.name +
                    ", " + s.id +
                    ", " + s.department +
                    ", " + s.score +
                    "] has received a distinction in arts");
        }
    }
}
