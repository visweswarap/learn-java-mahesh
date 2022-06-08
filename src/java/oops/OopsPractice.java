package oops;

public class OopsPractice {

    int abc;

    public static void main(String[] args) {
        TamperedGlass iphone12Glass = new TamperedGlass(9, 19, 0.5f);

        System.out.println(iphone12Glass.height);
        System.out.println("==============================");

        iphone12Glass.width = 8;
        iphone12Glass.height = 20;
        iphone12Glass.thickness = 0.6f;

        System.out.println(iphone12Glass.height);
        System.out.println("==============================");

        OopsPractice obj = new OopsPractice();
        obj.abc = 1234124;
        System.out.println(obj.abc);
        printMessage("adsfg asdF ASG ASDG ASDGF");

        OopsPractice obj1 = new OopsPractice();
        obj1.abc = 666666;
    }

    static void printMessage(String message){
        System.out.println(message);
    }
}
