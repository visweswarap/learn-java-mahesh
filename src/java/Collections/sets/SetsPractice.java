package collections.sets;

import collections.Employee;

import java.util.HashSet;
import java.util.Set;

public class SetsPractice {

    public static void main(String[] args) {
        // Don't allow duplicates
        // Only one null allowed
        // position not allowed .get(1)

        Employee employee = new Employee(1, 1000, "vish", "dev");
        Employee employee1 = new Employee(1, 1000, "vish", "dev");
        Employee employee2 = new Employee(1, 1000, "vish", "dev");

        Set<String> strSet = new HashSet<>();

        boolean addedA = strSet.add("abc");
        System.out.println("abc".hashCode());
        System.out.println(addedA);

        boolean addedX = strSet.add("xyz");
        System.out.println("xyz".hashCode());
        System.out.println(addedX);

        boolean addedB = strSet.add("abc");
        System.out.println("abc".hashCode());
        System.out.println(addedB);

        System.out.println(strSet.size());
        System.out.println("========================");

        Set<Employee> empSet = new HashSet<>();

        empSet.add(employee);
        System.out.println(employee.hashCode());
        empSet.add(employee1);
        System.out.println(employee1.hashCode());
        empSet.add(employee2);
        System.out.println(employee2.hashCode());

        System.out.println(empSet.size());
    }
}
