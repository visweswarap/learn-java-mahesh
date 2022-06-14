package oops.inheritance.interfaces;

public class PostgreSqlConnection implements DatabaseConnection {

    @Override
    public String produceConnection() {
        return "Postgre SQL connection obtained";
    }
}
