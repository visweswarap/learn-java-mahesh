package Collections.lists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

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
        for(Student1 std : st)
        {
            System.out.println("STUDENT ID IS : " + std.getStno() + "  STUDENT NAME IS : " + std.getStname() + " STUDENT AGE IS : " +
                    std.getStage() + " STUDENT MARKS ARE: " + std.getMarks() + " STUDENT COLLEGE IS :" + std.getStcoll());
        }
        Map<String,String> fruit = new HashMap<>();
        fruit.put("First","Apple");
        fruit.put("Second","Orange");
        fruit.put("Third","Mango");
        fruit.put("Fourth","Banana");
        fruit.put("Fifth","Water melon");
        System.out.println(fruit.get("First"));
        for(Map.Entry<String,String> pr :fruit.entrySet())
        {
            System.out.println(pr.getKey()+"::"+pr.getValue());
        }


    }
}
