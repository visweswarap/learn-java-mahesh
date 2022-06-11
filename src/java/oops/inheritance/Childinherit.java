package oops.inheritance;

public class Childinherit extends Inherit
{
    public void employee(int empid, String empname, int empsal, int empage)
    {
        this.empid = empid;
        this.stname = empname;
        this.empsal = empsal;
        this.empage = empage;
        System.out.println("DETAILS OF A EMPLOYEE ARE //////////////////////////:");
        System.out.println("EMPLOYEE  ID NUMBER IS    :" + empid);
        System.out.println("NAME OF THE EMPLOYEE IS  :" + empname);
        System.out.println("SALARY OF EMPLOYEE IS   :" + empsal);
        System.out.println("AGE OF THE EMPLOYEE IS     :" + empage);
    }
}
