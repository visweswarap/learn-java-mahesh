package oops.inheritance.interfaces;

public abstract class ChildAbstract implements ParentInterface{

    abstract void xyz();

    void printMessage(){
        System.out.println("Hello world...");

        ParentInterface parent = new ParentInterface() {
            @Override
            public String abc() {
                return "sadf ADF ASFASDF";
            }
        };

        parent.abc();

    }
}
