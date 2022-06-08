package oops;

import java.util.Scanner;
public class Banking {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.greeting();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE DEPOSITED AMOUNT ");
        int dep = scan.nextInt();
        bank.deposit(dep);
        System.out.println("ENTER THE WITHDRAWAL  AMOUNT ");
        int with1 = scan.nextInt();
        bank.withdraw(with1);
        System.out.println("YOUR ACCOUNT BALANE IS " + bank.getcurrentbal());
    }
}
