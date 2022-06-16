package oops.arrypracttice;
import java.util.Scanner;

public class Practicearry
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("ENTER THE ARRAY LENGTH");
       int arr = sc.nextInt();
        int [] array = new int[arr];
        System.out.println("ENTER THE ARRAY NUMBERS");
        for (int j=0;j<array.length;j++)
        {
            array[j]=sc.nextInt();
        }
        for(int index:array)
        {
            System.out.println("ARRAY ELEMENTS ARE "+index);
        }

    }

}
