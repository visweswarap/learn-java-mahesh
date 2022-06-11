package oops;

public class Encaps {
    private int srnum;
    private String sname;
    private int marks;
    public void  setRno(int srnum){
        this.srnum = srnum;
    }
    public int getRno(){
        return srnum;
    }
    public void setSname(String sname)
    {
        this.sname = sname;
    }
    public String getSname()
    {
        return sname;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
}
