package Collections;

import java.util.ArrayList;

class Employee
{
    private int empid;
    private String empname;
    private int empage;
    private  long empsal;
    public Employee(int empid,String empname,int empage,long empsal)
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
        ArrayList<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee(10, "MAHESH", 36, 350000));
        employee.add(new Employee(11, "VISSU", 35, 400000));
        employee.add(new Employee(12, "RAJESH", 35, 450000));

        for (Employee s : employee) {
            System.out.println("EMPLOYEE ID IS : " + s.getEmpid()+" EMPLOYEE NAME IS : "+s.getEmpname()
                    +" EMPLOYEE AGE IS : "+s.getEmpage()+" EMPLOYEE SALARY P/A IS :"+s.getEmpsal());
        }
    }
}
