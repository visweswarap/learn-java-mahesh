package collections;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Employee{ id=" + id + ", salary=" + salary +", name='" + name + "', dept='" + dept + "'}";
    }

    public String toJson(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
