package dip.without;

public class UserInterface {
    private OracleDatabase oracleDatabase; // Shouting tight coupling (as OracleDatabase is a class)!

    public UserInterface() {
        this.oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeeId(String id) {
        oracleDatabase.saveEmpIdInDb(id);
    }
}
