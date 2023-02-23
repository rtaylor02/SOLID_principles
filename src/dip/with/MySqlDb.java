package dip.with;

public class MySqlDb implements Database {
    @Override
    public void saveEmpIdInDb(String empId) {
        System.out.printf("Employee ID(%s) is saved in MySQL database%n", empId);
    }
}
