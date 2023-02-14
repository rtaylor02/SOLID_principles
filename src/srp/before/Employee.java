package srp.before;

import java.util.Random;

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
    
    public String checkSeniority(int experienceInYears) {
        return (experienceInYears > 5) ? "Senior" : "Junior";
    }

    public String generateId(String firstName) {
        int random = new Random().nextInt(1000);
        id = lastName.substring(0, 2) + random;
        return id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
}
