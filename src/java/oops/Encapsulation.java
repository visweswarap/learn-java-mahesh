package oops;

public class Encapsulation {

    private int id;
    private String name;
    private String department;
    private int salary;

    private String doSomething(){
        // Statements
        return "sfsdfdsf";
    }

    public int getId() {
        // if user is coming from Pakistan block it
        return id;
    }

    public void setId(int id) {
        // if id > 200000 then invalid request
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
