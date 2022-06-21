package exceptions;

public class PracticeExcep {

    public static void main(String[] args) throws MyException {
        System.out.println("Starting..........");

        try {
            int a = 10;
            int b = 0;

            int c = a / b;

            String s = null;
            if (s.equals("ASDF")){
                System.out.println("sdfgsdfgsfdg");
            }
        } catch (ArithmeticException ex){
            throw new MyException(ex.getMessage());
        } finally {
            System.out.println("Finalll.................");
            // Close connection
            // Release memory
        }

        System.out.println("finished program");
    }

}
