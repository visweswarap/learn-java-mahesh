package Collections.lists;

public class EmpDetails {
    private int empid;
    private String empname;
    private int empage;
    private  long empsal;
    public EmpDetails(int empid,String empname,int empage,long empsal)
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


