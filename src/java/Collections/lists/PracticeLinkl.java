package Collections.lists;

import java.security.Key;
import java.util.*;

class Student1
{
    private int stno;
    private String stname;
    private int stage;
    private int marks;
    private String stcoll;

    public Student1(int stno, String stname, int stage, int marks, String stcoll)
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
public class PracticeLinkl {
    public static void main(String[] args) {
        LinkedList<Student1> st = new LinkedList<>();
        st.add(new Student1(20,"XXXX",15,420,"MSR"));
        st.add(new Student1(21,"YYYY",14,450,"MSR"));
        st.addFirst(new Student1(22,"ZZZZ",15,500,"MSR"));
        System.out.println("**********************( - STUDENT DETAILS USING LL - )++++++++****************++++++");
        for(Student1 std : st)
        {
            System.out.println("STUDENT ID IS : " + std.getStno() + "  STUDENT NAME IS : " + std.getStname() + " STUDENT AGE IS : " +
                    std.getStage() + " STUDENT MARKS ARE: " + std.getMarks() + " STUDENT COLLEGE IS :" + std.getStcoll());
        }
        LinkedList<EmpDetails> employeed = new LinkedList<>();
        employeed.add(new EmpDetails(13, "RAJ", 35, 500000));
        employeed.addFirst(new EmpDetails(14, "RAJESH", 35, 450000));
        employeed.addLast(new EmpDetails(16, "MAHESH", 36, 350000));
        System.out.println("**********************( - EMPLOYEE DETAILS USING LL - )++++++++****************++++++");
        for(EmpDetails empd : employeed)
        {
            System.out.println("EMPLOYEE ID  IS : " + empd.getEmpid() + "  EMPLOYEE NAME IS : " + empd.getEmpname() + " EMPLOYEE AGE IS : " +
                    empd.getEmpage() + " EMPLOYEE SALARY P/A IS : " + empd.getEmpsal());
        }
        System.out.println("**********************( -  DETAILS USING MAP  - )++++++++****************++++++");
        Map<String,String> fruit = new HashMap<>();
        Map<Integer,EmpDetails> mapemp = new HashMap<Integer,EmpDetails>();
        mapemp.put(1,new EmpDetails(30, "MAHESH", 36, 350000));
        mapemp.put(2,new EmpDetails(31, "AAAAAA", 37, 400000));
        mapemp.put(3,new EmpDetails(32, "BBBBBB", 36, 450000));
        mapemp.put(4,new EmpDetails(33, "CCCCCC", 35, 500000));
        mapemp.put(5,new EmpDetails(34, "DDDDDD", 33, 400000));
        fruit.put("First","Apple");
        fruit.put("Second","Orange");
        fruit.put("Third","Mango");
        fruit.put("Fourth","Banana");
        fruit.put("Fifth","Water melon");
        fruit.remove("First");
        for(Map.Entry<String,String> pr :fruit.entrySet())
        {
            System.out.println(pr.getKey()+" :: "+pr.getValue());
        }


    }
}
