package oops.inheritance.prentchild;

import oops.inheritance.interfaces.DatabaseConnection;
import oops.inheritance.interfaces.MySQLConnection;
import oops.inheritance.interfaces.PostgreSqlConnection;

public class Practice {
    public static void main(String[] args) {

        System.out.println("================ Father ===============");
        Father father = new Father();
        System.out.println(father.location);
        System.out.println(father.nationality);

        System.out.println("\n================ Son ===============");
        Son vish = new Son();
        System.out.println(vish.location);
        vish.changeLocation("Hyderabad");
        System.out.println(vish.location);
        System.out.println(vish.nationality);
        System.out.println(vish.locationChangeYear);

        Father parent = new Son();

        System.out.println("\n================ Child ===============");
        Child jass = new Child();
        System.out.println(jass.location);
        System.out.println(jass.nationality);
        jass.changeLocation("NewYork");
        jass.migrateCountry("United Sates of America");
        System.out.println(jass.location);
        System.out.println(jass.nationality);

        DatabaseConnection connection = new MySQLConnection();

        connection.produceConnection();

    }
}
