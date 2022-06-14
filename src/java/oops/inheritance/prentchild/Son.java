package oops.inheritance.prentchild;

public class Son extends Father{
    private String education = "MCA";
    public int locationChangeYear;
    
    void changeOccupation(String newOccupation) {
        this.occupation = newOccupation;
    }

    @Override
    void changeLocation(String newLocation){
        this.location = newLocation;
        this.locationChangeYear = 2022;
    }
}
