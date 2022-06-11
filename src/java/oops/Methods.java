package oops;

    public class Methods {
    public void  employeeData(int empid,String empname,int empsalary,String empcomp)
    {
        System.out.println("EMPLOYEE ID IS          : "+empid);
        System.out.println("EMPLOYEE NAME IS        :"+empname);
        System.out.println("EMPLOYEE SALARY IS :    "+empsalary);
        System.out.println("EMPLOYEE WORKING COMPANY IS :"+ empcomp);
    }
    public void studentDate(int stno,String stname,int stmarks,int stage,String stcollege)
    {
        System.out.println("STUDENT ID NUMBER IS         : "+stno);
        System.out.println("NAME OF THE STUDENT IS      :"+stname);
        System.out.println("MARKS OF THE STUDENT IS     : "+stmarks);
        System.out.println("AGE OF THE STUDENT IS         :"+stage);
        System.out.println("COLLEGE NAME OF THE STUDENT IS : "+stcollege);
    }
    public void bankAcc(int accno,String accname,int withdrawamt,int bal,String mail)
    {
        System.out.println("DEAR CUSTOMER YOUR ACC NUMBER IS : "+accno);
        System.out.println("NAME OF THE ACCOUNT HOLDER IS   :   "+accname);
        System.out.println("WITHDRAWAL AMOUNT IS            :"+withdrawamt);
        System.out.println("BALANCE OF THE ACCOUNT IS       :"+bal);
        System.out.println("DEAR CUSTOMER VALID MAIL ID IS   :  "+mail);
    }
    public String name (String name)
    {
        return name;
    }
}


