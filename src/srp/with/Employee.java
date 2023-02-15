package srp.with;

import java.util.Random;

/* Using SRP, id generation and seniority checking are delegated to different classes,
EmployeeIdGenerator and SeniorityChecker respectively.
* These classes are responsible for id generation and seniority check respectively. */
public class Employee {
    private String firstName, lastName, id;
    private int experienceInYears;

    public Employee(String firstName, String lastName, int experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public void display() {
        System.out.println("Employee name: " + firstName + " " + lastName);
        System.out.printf("Experience: %d years%n", experienceInYears);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}

class EmployeeIdGenerator {
    String id;

    public String generateId(String lastName) {
        int random = new Random().nextInt(1000);
        id = lastName.substring(0, 2) + random;
        return id;
    }
}

class SeniorityChecker {
    public String checkSeniority(int experienceInYears) {
        return (experienceInYears > 5) ? "Senior" : "Junior";
    }
}
