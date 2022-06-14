package oops.interfacepractice;
abstract class Arithamatic
{   int a,b,c;
    public void add(int a,int b)
    {
        this.c = a+b;
        System.out.println("addition of two numbers is "+c);
    }
    abstract  void sub(int a,int b);
}
 class Imp extends Arithamatic
{
    void sub(int a ,int b)
    {
        System.out.println("SUBTRACTION OF TWO NUMBERS ARE "+(a-b));
    }
}
public class Practiceabstract {
    public static void main(String[] args) {
        Imp a = new Imp();
        a.add(5,6);
        a.sub(40,20);
    }

}
