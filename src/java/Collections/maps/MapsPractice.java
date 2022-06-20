package collections.maps;

import collections.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsPractice {

    public static void main(String[] args) {
        Map<String, String> contactsMap = new HashMap<>();

        contactsMap.put("abc", "asdfadsfgadf");




        Map<String, Employee> empMap = new HashMap<>();

        Employee vishEmp = new Employee(1, 1000, "vish", "dev");

        empMap.put("vish", vishEmp);
        empMap.put("sddd", vishEmp);
        empMap.put("xyz", vishEmp);
        empMap.put("aaa", vishEmp);
        empMap.put("esfd", vishEmp);

        Employee employee = empMap.get("vish");

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());

    }
}
