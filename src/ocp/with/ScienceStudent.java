package ocp.with;

public class ScienceStudent extends Student {
    public ScienceStudent(String name, String department, String id, double score) {
        super(name, id, score);
        this.department = department;
    }
}
