package Collections.lists;

//import Collections.Employee1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student
{
    private int stno;
    private String stname;
    private int stage;
    private int marks;
    private String stcoll;

    public Student(int stno, String stname, int stage, int marks, String stcoll)
    {
        this.stno = stno;
        this.stname = stname;
        this.stage = stage;
        this.marks = marks;
        this.stcoll = stcoll;
    }

    public int getStno() {
        return stno;
    }

    public void setStno(int stno) {
        this.stno = stno;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStcoll() {
        return stcoll;
    }

    public void setStcoll(String stcoll) {
        this.stcoll = stcoll;
    }
}
public class StudentArray {
    public static <Employee1> void main(String[] args)
    {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(100,"MAHESH",18,300,"SIR RAMAN"));
        st.add(new Student(101,"VISSU",17,500,"SIR RAMAN"));
        st.add(new Student(102,"RAJESH",18,400,"SIR RAMAN"));
        st.add(new Student(103,"RAMESH",19,200,"SIR RAMAN"));
        System.out.println("**********************( - STUDENT DETAILS ARE - )++++++++****************++++++");
        for(Student s : st)
                  {
            System.out.println("STUDENT ID IS : " + s.getStno() + "  STUDENT NAME IS : " + s.getStname() + " STUDENT AGE IS : " +
                    s.getStage() + " STUDENT MARKS ARE: " + s.getMarks() + " STUDENT COLLEGE IS :" + s.getStcoll());
                    }
        List<Student> students = new ArrayList<>();
        LinkedList<EmpDetails> ll =new LinkedList<>();
        Student stu1 = new Student(107,"XXXX",21,460,"RSR");
        Student stu = new Student(104,"VENKY",20,450,"MSR ");
        students.add(stu);
        students.add(new Student(105,"VRSHI",14,550,"MSR "));
        System.out.println("**********************( - STUDENT DETAILS USING LIST - )++++++++****************++++++");
        for(Student std : students)
        {
            System.out.println("STUDENT ID IS : " + std.getStno() + "  STUDENT NAME IS : " + std.getStname() + " STUDENT AGE IS : " +
                    std.getStage() + " STUDENT MARKS ARE: " + std.getMarks() + " STUDENT COLLEGE IS :" + std.getStcoll());
        }
        List<EmpDetails> employee = new ArrayList<>();
        EmpDetails emp = new EmpDetails(10, "MAHESH", 36, 350000);
        employee.add(emp);
        employee.add(new EmpDetails(11, "VENU", 36, 300000));
        employee.add(new EmpDetails(12, "VISH", 37, 400000));
        employee.add(new EmpDetails(13, "RAJ", 35, 500000));
        EmpDetails emp1 = new EmpDetails(16, "MAHESH", 36, 250000);
        ll.add(emp1);
        System.out.println("**********************( - EMPLOYEE DETAILS - )++++++++****************++++++");
        for(EmpDetails empd : employee)
        {
            System.out.println("EMPLOYEE ID  IS : " + empd.getEmpid() + "  EMPLOYEE NAME IS : " + empd.getEmpname() + " EMPLOYEE AGE IS : " +
                    empd.getEmpage() + " EMPLOYEE SALARY P/A IS : " + empd.getEmpsal());
        }
        System.out.println("**********************( - EMPLOYEE DETAILS USING LL- )++++++++****************++++++");
        for(EmpDetails empd : ll)
        {
            System.out.println("EMPLOYEE ID  IS : " + empd.getEmpid() + "  EMPLOYEE NAME IS : " + empd.getEmpname() + " EMPLOYEE AGE IS : " +
                    empd.getEmpage() + " EMPLOYEE SALARY P/A IS : " + empd.getEmpsal());
        }



    }
}
