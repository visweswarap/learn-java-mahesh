package oops.inheritance;
public class Superchildinherit extends Childinherit
{

    public  void accdetails(int accno,String accname,int accbal,String accmail)
    {
        this.accno = accno;
        this.accname = accname;
        this.accbal = accbal;
        this.accmail = accmail;
        System.out.println("DETAILS OF A ACCOUNT HOLDER IS :******************");
        System.out.println("ACCOUNT HOLDER ACCOUNT NUMBER IS : "+accno);
        System.out.println("NAME OF THE ACCOUNT HOLDER IS     :   "+accname);
        System.out.println("BALANE OF THE ACCOUNT  HOLDER IS  : "+accbal);
        System.out.println("MAIL ID OF ACCOUNTHOLDER IS        :"+accmail);
    }
}
