package oops.interfacepractice;
interface vehicle
{
    void  changegear(int a);
    void   speed(int b);
}
class Bicycle implements vehicle
{  int a;
    int b;
    public void changegear(int a)
    {
        this.a = a;
        System.out.println("1.   present gear of a bicycle is "+a);
    }
    public void  speed(int b){
        this.b = b;
        System.out.println("2. present bicycle speed is  "+b);
    }
}
class Bike implements vehicle
{   int a;
    int b;
    public void changegear(int a)
    {
        this.a = a;
        System.out.println("1.  present running gear of a bike is "+a);
    }
    public void speed(int b)
    {
        this.b = b;
        System.out.println("2. present bike speed is "+b);
    }
}
public class Practiceinter {
    public static void main(String[] args) {
        Bicycle bc = new Bicycle();
        System.out.println("************bicycle********");
        bc.changegear(2);
        bc.speed(20);
        System.out.println("***********BIKE************");
        Bike bk = new Bike();
        bk.changegear(4);
        bk.speed(70);

    }


}
