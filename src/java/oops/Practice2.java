package oops;

public class Practice2 {
    public static void main(String[] args) {
        Encaps2 enc2 = new Encaps2();
        enc2.setAccno(2226);
        enc2.setAccname("V MAHESH");
        enc2.setMail("mahesh.vonteru@gmail.com");
        enc2.setBalance(45000);
        System.out.println("ACCOUNT NUMBER OF CUSTOMER IS   :"+ enc2.getAccno());
        System.out.println("NAME OF THE ACCOUNT HOLDER IS   :"+enc2.getAccname());
        System.out.println("MAIL ID OF THE ACCOUNT HOLDER IS: "+enc2.getMail());
        System.out.println("BALANCE OF THE ACCOUNT HOLDER IS:"+enc2.getBalance());
    }
}
