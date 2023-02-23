package dip.with;

public class UserInterface {
    Database db;

    public UserInterface(Database database) {
        this.db = database;
    }

    public void saveEmployeeId(String id) {
        db.saveEmpIdInDb(id);
    }

    public void setDatabase(Database database) {
        this.db = database;
    }
}
