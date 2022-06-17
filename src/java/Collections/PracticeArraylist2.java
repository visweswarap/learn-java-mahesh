package collections;

import java.util.ArrayList;

class Employee1
{
    private int empid;
    private String empname;
    private int empage;
    private  long empsal;
    public Employee1(int empid, String empname, int empage, long empsal)
    {
        this.empid = empid;
        this.empname = empname;
        this.empage = empage;
        this.empsal = empsal;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public long getEmpsal() {
        return empsal;
    }

    public void setEmpsal(long empsal) {
        this.empsal = empsal;
    }
}
public class PracticeArraylist2 {
    public static void main(String[] args) {
        ArrayList<Employee1> employee = new ArrayList<Employee1>();
        employee.add(new Employee1(10, "MAHESH", 36, 350000));
        employee.add(new Employee1(11, "VISSU", 35, 400000));
        employee.add(new Employee1(12, "RAJESH", 35, 450000));

        for (Employee1 s : employee) {
            System.out.println("EMPLOYEE ID IS : " + s.getEmpid()+" EMPLOYEE NAME IS : "+s.getEmpname()
                    +" EMPLOYEE AGE IS : "+s.getEmpage()+" EMPLOYEE SALARY P/A IS :"+s.getEmpsal());
        }
    }
}
