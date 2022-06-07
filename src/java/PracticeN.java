public class PracticeN {
    public static void main(String[] args) {
        int x = 40;
        int y = 20;
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = y % x;
        System.out.println("Addition value is : " + a);
        System.out.println("Substraction value is :  " + b);
        System.out.println("Multiplication of two value's is :" + c);
        System.out.println("Modula amount of x and y is : " + d);
        if (x == y) {
            System.out.println("You given two numbers are same");
        }
        if (x < y) {
            System.out.println("In you enter numbers x is lessthan y ");
        }
        if (x > y) {
            System.out.println("In your enter numbers x is grater than y");
        }
        if (x <= y) {
            ++x;
            System.out.println("YOUR ENTERED NUMBERS ARE " + x);
        }
        if (x >= y) {
            ++y;
            System.out.println("YOUR ENTERED NUMBER ARE " + y);
        }
        if (x >= 10 && x <= 40) {
            System.out.println("Your entered number between 10 and 40 ");
        }
        if(y >= 10 || y<= 20){
            System.out.println("YOUR ENTERED NUMBER BETWEEN 10 AND 20");
        }

    }
}
