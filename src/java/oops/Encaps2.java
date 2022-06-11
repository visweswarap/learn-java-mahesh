package oops;

public class Encaps2 {
    private int accno;
    private String accname;
    private String mail;
    private int balance;
    public void setAccno(int accno1)
    {
        this.accno = accno1;
    }

    public int getAccno() {
        return accno;
    }
    public void setAccname(String accname1)
    {
        this.accname = accname1;
    }
    public String getAccname()
    {
        return accname;
    }
    public void setMail(String mail1)
    {
        this.mail = mail1;
    }
    public String getMail()
    {
        return mail;
    }
    public void setBalance(int balance1)
    {
        this.balance = balance1;
    }
    public int getBalance()
    {
        return balance;
    }
}
