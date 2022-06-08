public class Operators {
    public static void main(String[] args) {
        int a = 11;
        int b = 34;
        if (a == 10 && b== 10){
            System.out.println("both same.........");
        } if (a == 10 || b == 10) {
            System.out.println("One record matched.....");
        } else {
            System.out.println("Nothing matched....");
        }

        // Ternary
        int x = 0;
        if(a==10){
            x = a;
        } else {
            x = b;
        }
        String y = a==10 ? "TEN" : "Other";
        // <condition> ? <Value if condition success> : <Value if condition failed>

        System.out.println(x);
    }

}
