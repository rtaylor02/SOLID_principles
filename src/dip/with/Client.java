package dip.with;


public class Client {
    public static void main(String[] args) {
        Database database = new OracleDb();
        UserInterface ui = new UserInterface(database);
        ui.saveEmployeeId("123");

        // Changing database is not a problem!
        database = new MySqlDb();
        ui.setDatabase(database);
        ui.saveEmployeeId("999");
    }
}
