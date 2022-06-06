import java.util.Scanner;
public class Practiceif {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a marks");
        int j = scan.nextInt();
        System.out.println("You entered marks are " + j );
        if(j>=90 && j<=100){
            System.out.println("Grade is A ");}
        else if(j<90 && j>=80){
                System.out.println("Grade is B ");
            }
        else if(j<80 && j>=60){
            System.out.println("Grade is C");
        }
        else {
            System.out.println("FAIL ");
        }

    }
}
