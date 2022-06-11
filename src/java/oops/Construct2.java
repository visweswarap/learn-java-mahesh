package oops;

import jdk.swing.interop.SwingInterOpUtils;

public class Construct2 {
    int empid;
    String empname;
    int empsal;
    String empcomp;
    public Construct2(int empid)
    {
        this.empid = empid;
        System.out.println("EMPLOYEE ID IS :"+empid);
    }
    public Construct2(int empid,String empname)
    {
        this.empid = empid;
        this.empname = empname;
        System.out.println("EMPLOYEE ID IS   :"+empid);
        System.out.println("EMPLOYEE NAME IS : "+empname);
    }
    public Construct2(int empid,String empname,String empcomp)
    {
        this.empid = empid;
        this.empname = empname;
        this.empcomp = empcomp;
        System.out.println("EMPLOYEE ID IS : "+empid);
        System.out.println("EMPLOYEE NAME : "+empname);
        System.out.println("EMPLOYEE COMP IS "+empcomp);
    }
    public Construct2(int empid,String empname,String empcomp,int empsal)
    {
        this.empid = empid;
        this.empname = empname;
        this.empcomp = empcomp;
        System.out.println("EMPLOYEE ID IS : "+empid);
        System.out.println("EMPLOYEE NAME : "+empname);
        System.out.println("EMPLOYEE COMP IS "+empcomp);
        System.out.println("EMPLOYEE COMP IS "+empsal);
    }
}
