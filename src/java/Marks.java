import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
       Scanner marks = new Scanner(System.in);
       System.out.println("ENTER TOTAL MARKS IN FIRST LANGUAGE: ");
        int f = marks.nextInt();
        System.out.println("ENTER TOTAL MARKS IN SECOND LANGUAGE: ");
        int se = marks.nextInt();
        System.out.println("ENTER TOTAL MARKS IN THIRD LANGUAGE: ");
        int t = marks.nextInt();
        System.out.println("ENTER TOTAL MARKS IN PHYSICS LANGUAGE: ");
        int p = marks.nextInt();
        System.out.println("ENTER TOTAL MARKS IN CHEMISTRY LANGUAGE: ");
        int c = marks.nextInt();
        System.out.println("ENTER TOTAL MARKS IN SOCIAL LANGUAGE: ");
        int sc = marks.nextInt();
        int total = f+se+t+p+c+sc;
        if(f<35 || se<35 || t<35 || p<35 || c<35 || sc<35){
            System.out.println("YOU ARE FAIL");
        }
        System.out.println("TOTAL MARKS ARE " + total);
        if(total>=550 && total<= 600){
            System.out.println("STUDENT GRADE IS A+");
                    }
        if(total>=500 && total<550){
            System.out.println("STUDENT GRADE IS A");
        }
        if(total>=400 && total<500){
            System.out.println("STUDENT GRADE IS B");
        }
    }
}
