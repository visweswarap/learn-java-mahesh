import java.util.Scanner;
public class Username {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("ENTER USER NAME");
        String username = user.nextLine();
        System.out.println("ENTER PASS WARD");
        String passward = user.nextLine();
        String usernameReq = "mahesh";
        String passwordReq = "vonteru@123";

        if(!username.equals(usernameReq)&&!passward.equals(passwordReq)){
            System.out.println("YOU ARE ENTER USER NAME OR PASSWARDS ARE NOT MATCHED TRY AGAIN");
            System.out.println("ENTER USER NAME");
            String username2 = user.nextLine();
            System.out.println("ENTER PASS WARD");
            String passward2 = user.nextLine();
            if(!username2.equals(usernameReq)&&!passward2.equals(passwordReq)){
                System.out.println("YOU ARE ENTER USER NAME OR PASSWARDS ARE NOT MATCHED ONLY ONE CHANCE REMAINING  TRY AGAIN ");
                System.out.println("ENTER USER NAME");
                String username3 = user.nextLine();
                System.out.println("ENTER PASS WARD");
                String passward3 = user.nextLine();
                if(!username3.equals(usernameReq)&&!passward3.equals(passwordReq)){
                    System.out.println("YOU ARE ENTER USER NAME OR PASS WARDS ARE NOT MATCHED CONTACT NEAREST BRANCH  ");
                }else{
                    System.out.println("CONGRATS !.... YOUR ACCOUNT BALANCE IS RS 10,000/-");}
            }else{
                System.out.println("CONGRATS !.... YOUR ACCOUNT BALANCE IS RS 10,000/-");}
        }else{
            System.out.println("CONGRATS !.... YOUR ACCOUNT BALANCE IS RS 10,000/-");
        }
    }
}
