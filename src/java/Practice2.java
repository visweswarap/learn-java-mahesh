import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        /* int year = 2020;
        if(((year%4 == 0)&&(year%100 != 0))||(year%400 ==0))
        {
            System.out.println("YOU ARE ENTER YEAR IS LEAF YEAR");
        }
        else
        {
            System.out.println("YOU ARE ENTER YEAR IS COMMON YEAR");
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a = scan.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int b = scan.nextInt();
        System.out.println("THE ADDITION OF TWO NUMBERS IS : "+(a+b));
        System.out.println("THE SUBTRACTION  OF TWO NUMBERS IS : "+(a-b));
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS : "+(a*b));
        System.out.println("THE  DIVISION OR MODULO OF OF TWO NUMBERS IS : "+(a%b));
        if(a == b){
            System.out.println("YOU ARE ENTERED TWO NUMBERS ARE THE SAME ");
        }
        if(a < b){
            System.out.println("IN TWO NUMBERS FIRST NUMBER  IS LESTHAN SECOND NUMBER  ");
        }
        if(a > b){
            System.out.println("IN TWO NUMBERS FIRST NUMBER  IS GRATER THAN SECOND NUMBER  ");
        }
        if(a <= 100){
            System.out.println("FIRST NUMBER IS BELLOW 100  ");
        }else {
            System.out.println("FIRST NUMBER IS ABOVE 100");
        }
        if(b >= 200){
            System.out.println("SECOND NUMBER IS ABOVE 200  ");
        }else {
            System.out.println("SECOND  NUMBER IS BELLOW 200");
        }

    }
}
