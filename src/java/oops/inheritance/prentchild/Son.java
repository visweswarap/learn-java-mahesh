package oops.inheritance.prentchild;

public class Son extends Father{
    private String education = "MCA";
    
    void changeOccupation(String newOccupation) {
        this.occupation = newOccupation;
    }
}
