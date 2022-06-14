package oops.inheritance.interfaces;

public abstract class ChildAbstract implements ParentInterface{

    abstract void xyz();

    void printMessage(){
        System.out.println("Hello world...");
    }
}
