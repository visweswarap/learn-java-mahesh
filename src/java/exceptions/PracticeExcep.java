package exceptions;

public class PracticeExcep {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting..........");

        System.out.println("finished program");

        message(null);
    }

    static String message(String message) throws Exception {
        int a = 10;
        if(message == null){
            throw new MyException("You passed null message");
        }
        System.out.println("message");
        return "Success";
    }

}
