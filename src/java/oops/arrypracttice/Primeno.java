package oops.arrypracttice;

import java.util.Scanner;
public class Primeno {
    public static void main(String[] args) {

        int m, n=0, o;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER (FOR CHECK ITS PRIME NO OR NOT)");
        o = sc.nextInt();
         m = o/2;
        if(o==0||o==1)
        {
            System.out.println("YOU ARE ENTER NUMBER "+o+" IS NOT A  PRIME NUMBER");
        }
        else
        {
             for(int i=2;i<=m;i++)
             {
                 if(o%i==0)
                 {
                    System.out.println("YOU ARE ENTER NUMBER "+o+" IS NOT A  PRIME NUMBER");
                     n=1;
                        break;
                 }
              }
                if(n==0)
                    {
                 System.out.println("YOU ARE ENTER NUMBER "+o+"  IS  A  PRIME NUMBER");
                    }
        }
    }
}
