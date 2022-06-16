package oops.arrypracttice;

import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER FOR CHECK IT IS ODD OR EVEN NUMBER:  ");
        int ch = sc.nextInt();
         String ch1;
         ch1 = ch%2==0?"EVEN":"EVEN";

         if(ch1.equals("EVEN"))
         {
             System.out.println("YOU ARE ENTER NUMBER IS EVEN NUMBER");
         }
         else
         {
             System.out.println("YOU ARE ENTER NUMBER IS ODD NUMBER");
         }
    }
}
