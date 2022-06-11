package oops;

public class Construct {

    int sno;
    String sname;
    int  marks;
    public Construct(int sno)
    {
       this.sno = sno;
        System.out.println("SERIAL NUMBER OF A STUDENT IS "+sno);
    }

    public Construct (int sno, String sname)
    {
        this.sno = sno;
        this.sname = sname;
        System.out.println("SERIAL NUMBER OF A STUDENT IS : "+sno);
        System.out.println("NAME OF THE  STUDENT IS :       "+sname);
    }
    public Construct(int sno, String sname, int marks)
    {
        this.sno = sno;
        this.sname = sname;
        this.marks = marks;
        System.out.println("SERIAL NUMBER OF A STUDENT IS  :"+sno);
        System.out.println("NAME  OF THE  STUDENT IS       :"+sname);
        System.out.println("MARKS OF THE  STUDENT IS       :  "+marks);
    }

}


