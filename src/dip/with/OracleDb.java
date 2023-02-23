package dip.with;

public class OracleDb implements Database {
    @Override
    public void saveEmpIdInDb(String empId) {
        System.out.printf("Employee ID(%s) is saved in Oracle database%n", empId);
    }
}
