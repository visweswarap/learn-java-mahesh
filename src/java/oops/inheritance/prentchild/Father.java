package oops.inheritance.prentchild;

public class Father {

    String location = "Kavali";

    String nationality = "Indian";

    private String education = "5th";

    String occupation = "Farmer";

    void changeLocation(String newLocation){
        this.location = newLocation;
    }

    void migrateCountry(String newCountry){
        this.nationality = newCountry;
    }

}
