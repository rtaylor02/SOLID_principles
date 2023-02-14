package srp.after;

public class Client {
    public static void main(String[] args) {
        Employee arthur = new Employee("Arthur", "Nichols", 3);
        showDetails(arthur);

        Employee mary = new Employee("Mary", "Antler", 13);
        showDetails(mary);
    }

    private static void showDetails(Employee e) {
        e.display();
        System.out.printf("Employee id: %s%n", new EmployeeIdGenerator().generateId(e.getLastName()));
        System.out.printf("Seniority: %s%n", new SeniorityChecker().checkSeniority(e.getExperienceInYears()));
        System.out.println("================");
    }
}
