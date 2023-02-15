package ocp.without;

public class Student {
    private String name, department, id;
    private double score;

    public Student(String name, String department, String id, double score) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
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