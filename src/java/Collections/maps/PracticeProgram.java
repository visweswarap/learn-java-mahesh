package Collections.maps;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class BankDetails
{
    private int accNo;
    private  String accName;
    private long  accBal;
    private String accPhno;
    private String bankLoc;

    public BankDetails(int accNo, String accName, long accBal, String accPhno, String bankLoc) {
        this.accNo = accNo;
        this.accName = accName;
        this.accBal = accBal;
        this.accPhno = accPhno;
        this.bankLoc = bankLoc;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public long getAccBal() {
        return accBal;
    }

    public void setAccBal(long accBal) {
        this.accBal = accBal;
    }

    public String getAccPhno() {
        return accPhno;
    }

    public void setAccPhno(String accPhno) {
        this.accPhno = accPhno;
    }

    public String getBankLoc() {
        return bankLoc;
    }

    public void setBankLoc(String bankLoc) {
        this.bankLoc = bankLoc;
    }
}
public class PracticeProgram {
    public static void main(String[] args) {
        ArrayList<BankDetails> arrbank = new ArrayList<>();
        LinkedList<BankDetails> linklbank = new LinkedList<>();
        Map<Integer,String> mapdetails = new HashMap<>();
        Map<Integer,BankDetails> mapBank = new HashMap<>();
        arrbank.add(new BankDetails(2226,"MAHESH",5000,"9490782278","KAVALI"));
        arrbank.add(new BankDetails(2018,"VENU  ",5500,"8096699126","KAVALI"));
        arrbank.add(new BankDetails(3074,"SRINU ",6000,"9948312013","NELLORE"));
        arrbank.add(new BankDetails(3145,"HAFEEZ",3000,"8466999045","NELLORE"));
        arrbank.add(new BankDetails(6170,"RAJESH",1000,"8466999095","KAVALI"));
        System.out.println("---------------ACCOUNT DETAILS USING ARRAY LIST IS ------------------------------");
        for(BankDetails arrbank1 : arrbank)
        {
            System.out.println("ACCOUNT NUMBER  IS ::"+arrbank1.getAccNo()+"  ACCOUNT HOLDER NAME IS :: "+arrbank1.getAccName()+
                    "   ACCOUNT BALANCE IS :: "+arrbank1.getAccBal()+ "   ACCOUNT HOLDER PHONE NUMBER IS ::"+arrbank1.getAccPhno()+
                    "   ACCOUNT HOLDER BANK LOCATION IS ::"+arrbank1.getBankLoc());
        }
        linklbank.add(new BankDetails(2226,"MAHESH",5000,"9490782278","KAVALI"));
        linklbank.add(new BankDetails(2018,"VENU  ",5500,"8096699126","KAVALI"));
        linklbank.add(new BankDetails(3074,"SRINU ",6000,"9948312013","NELLORE"));
        linklbank.add(new BankDetails(3145,"HAFEEZ",3000,"8466999045","NELLORE"));
        linklbank.add(new BankDetails(6170,"RAJESH",1000,"8466999095","KAVALI"));
        System.out.println("---------------ACCOUNT DETAILS USING LINKED LIST IS ------------------------------");
        for(BankDetails arrbank1 : linklbank)
        {
            System.out.println("ACCOUNT NUMBER  IS ::"+arrbank1.getAccNo()+"  ACCOUNT HOLDER NAME IS :: "+arrbank1.getAccName()+
                    "   ACCOUNT BALANCE IS :: "+arrbank1.getAccBal()+ "   ACCOUNT HOLDER PHONE NUMBER IS ::"+arrbank1.getAccPhno()+
                    "   ACCOUNT HOLDER BANK LOCATION IS ::"+arrbank1.getBankLoc());
        }
        mapdetails.put(1,"MAHESH");
        mapdetails.put(2,"VENU  ");
        mapdetails.put(3,"SRINU ");
        mapdetails.put(4,"HAFEEZ");
        mapdetails.put(5,"RAJESH");
        System.out.println("---------------DETAILS USING MAP  IS ------------------------------");
        for(Map.Entry<Integer,String> map:mapdetails.entrySet())
        {
            System.out.println("KEY IS ::"+map.getKey()+"    VALUE IS ::"+map.getValue());
        }
    }

}
