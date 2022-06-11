package oops;

import java.util.Scanner;
public class Practiceoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Encaps1 enc1 = new Encaps1();
        System.out.println("ENTER EMPLOYEE ID NUMBER  :" );
        enc1.setEmpid(scan.nextInt());
        enc1.setEmpname("MAHESH");
       /* System.out.println("ENTER EMPLOYEE NAME       : ");
        enc1.setEmpname(scan.nextLine());*/
        System.out.println("ENTER EMPLOYEE AGE        :");
        enc1.setEmpage(scan.nextInt());
        System.out.println("ENTER EMPLOYEE SALARY P/M :");
        enc1.setEmpsal(scan.nextInt());
        System.out.println("EMPLOYEE ID NUMBER IS :"+enc1.getEmpid());
        System.out.println("EMPLOYEE NAME IS      :"+enc1.getEmpname());
        System.out.println("EMPLOYEE AGE IS       :"+enc1.getEmpage());
        System.out.println("EMPLOYEE SALARY PM IS :"+enc1.getEmpsal());
    }
}
