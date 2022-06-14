package oops.inheritance.interfaces;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public String produceConnection() {
        return "MySQL connection produced....";
    }
}
