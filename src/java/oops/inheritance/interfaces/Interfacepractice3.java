package oops.inheritance.interfaces;
interface Staff
{
    void accStaff(String empname);
    void bidStaff(String empnamel);
    void collStaff(String empname);
}
interface Staffsal
{
    void accStaff(int empBsal,int empGsal);
    void bidStaff(int empBsal,int empGsal);
    void collStaff(int empBsal,int empGsal);
}
class Zo implements Staff,Staffsal
{
    String empname;
    int empBsal,empGsal;
    public void accStaff (String empname )
    {
        this.empname = empname;
        System.out.println("EMPLOYEE NAME  OF ACC STAFF "+empname);
        System.out.println("***********************************");
    }
    public void bidStaff(String empname)
    {
        this.empname = empname;
        System.out.println("EMPLOYEE NAME  OF BID PAYABLE  STAFF "+empname);
        System.out.println("***********************************");
    }
    public void collStaff(String empname)
    {
        this.empname = empname;
        System.out.println("EMPLOYEE NAME  OF COLLECTION   STAFF "+empname);
        System.out.println("***********************************");
    }
    public void accStaff (int empBsal,int empGsal)
    {
        this.empBsal = empBsal;
        this.empGsal = empGsal;
        System.out.println("ACCOUNTS  STAFF BASIC SALARY IS  "+empBsal);
        System.out.println("ACCOUNTS STAFF GRASS  SALARY IS  "+empGsal);
        System.out.println("***********************************");
    }
    public void bidStaff(int empBsal,int empGsal)
    {
        this.empBsal = empBsal;
        this.empGsal = empGsal;
        System.out.println("BID PAYABLE STAFF BASIC SALARY IS  "+empBsal);
        System.out.println("BID PAYABLE STAFF GROSS SALARY IS  "+empGsal);
        System.out.println("***********************************");
    }
    public void collStaff(int empBsal,int empGsal)
    {
        this.empBsal = empBsal;
        this.empGsal = empGsal;
        System.out.println("COLLECTION STAFF BASIC SALARY IS  "+empBsal);
        System.out.println("COLLECTION  STAFF GROSS SALARY IS  "+empGsal);
        System.out.println("***********************************");
    }
}

public class Interfacepractice3 {
    public static void main(String[] args) {
        Staff sn = new Zo();
        Staffsal sn1 = new Zo();
        Zo z = new Zo();
        sn.accStaff("LAKSHMI");
        sn1.accStaff(15000,18000);
        sn1.collStaff(4102,12000);
        z.bidStaff("ASHOK");
        z.bidStaff(4102,26000);
    }
}
