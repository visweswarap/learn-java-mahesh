package oops;

public class Practicemethods {

    public static void main(String[] args)
    {
        Methods emp = new Methods();
        emp.employeeData(123, "MAHESH", 45000, "VISSU TECH");
        System.out.println("******************************************************");
        emp.studentDate(142,"VISSU",595,34,"SIR RAMAN ");
        System.out.println("*****************************************************");
        emp.bankAcc(2226,"MAHESH",500,500,"mahesh.vonteru@gmail.com");
        System.out.println("*****************************************************");
        System.out.println("GURU OF THIS PROJECT IS "+emp.name("VISSU TECH"));
    }
}
