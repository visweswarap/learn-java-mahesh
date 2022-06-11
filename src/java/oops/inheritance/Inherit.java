package oops.inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Inherit
{
    int stno,empid,accno,marks,accbal;
    String stname,empname,accname,accmail;
    int stage,empage,empsal;
    public void student(int stno,String stname,int marks,int stage)
    {
        this.stno = stno;
        this.stname = stname;
        this.marks = marks;
        this.stage = stage;
        System.out.println("STUDET DETAILS ARE-------------:");
        System.out.println("STUDENT ID NUMBER IS    :"+stno);
        System.out.println("NAME OF THE STUDENT IS  :"+stname);
        System.out.println("MARKS OF THE STUDENT ARE  :"+marks);
        System.out.println("AGE OF THE STUDENT IS     :"+stage);
    }
}


