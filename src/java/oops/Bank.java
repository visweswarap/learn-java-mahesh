package oops;

public class Bank {
    int currentbal = 1000;

    public void greeting() {
        System.out.println("WELCOME TO VISSU'S BANKING ");
    }

    public void deposit(int amount) {
        currentbal = currentbal + amount;
        System.out.println("YOU ARE ACCOUNT PRESENT BALANCE IS " + currentbal);
    }

    public void withdraw(int with) {
        currentbal = currentbal - with;
        if (currentbal <= 1000) {
            System.out.println("YOUR ACCOUNT INSUFFICIENT BALANCE ");
        } else {

            System.out.println("YOU ARE ACCOUNT PRESENT BALANCE IS " + currentbal);
        }
    }

    public int getCurrentbal() {
        return currentbal;
    }


}
