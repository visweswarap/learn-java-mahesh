package collections.lists;

import collections.Employee;

import java.util.ArrayList;
import java.util.List;

public class PracticeLists {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, 1000, "vish", "dev"));
        empList.add(new Employee(2, 1000, "pepala", "qa"));
        empList.add(new Employee(3, 1000, "mahesh", "admin"));
        empList.add(new Employee(4, 1000, "xyz", "qa"));
        empList.add(0, new Employee(5, 1000, "abc", "devops"));

        System.out.println(empList.size());

        Employee[] empArray = new Employee[10];
        empArray[0] = new Employee(1, 1000, "vish", "dev");
        empArray[1] = new Employee(2, 1000, "pepala", "qa");

        empArray[0] = new Employee(3, 1000, "xxxx", "qa");

        System.out.println(empArray.length);

        for (Employee employee : empArray) {
            System.out.println(employee.getName());
        }
    }
}
