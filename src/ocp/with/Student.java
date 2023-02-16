package ocp.with;

public class Student {
    String name, department, id;
    double score;

    public Student(String name, String id, double score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
