package ocp.with;

public class ArtsStudent extends Student {
    public ArtsStudent(String name, String department, String id, double score) {
        super(name, id, score);
        this.department = department;
    }
}
