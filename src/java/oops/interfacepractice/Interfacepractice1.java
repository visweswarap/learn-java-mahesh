package oops.interfacepractice;

import javax.management.MBeanAttributeInfo;

interface Writter
{
    void write();
}
class Pen implements Writter
{
   public void write()
   {
       System.out.println("I AM THE PEN WRITER ");
   }
}
class Pencil implements Writter
{
    public void write()
    {
        System.out.println("I AM THE PENCIL; WRITER");
    }
}

public class Interfacepractice1 {
    public static void main(String[] args)
    {
        Pencil pc = new Pencil();
        pc.write();
        Pen p = new Pen();
        p.write();

    }
}
