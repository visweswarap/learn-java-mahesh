package collections;

public class Employee {

    private int id;
    private int salary;
    private String name;
    private String dept;

    public Employee(int id, int salary, String name, String dept) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
