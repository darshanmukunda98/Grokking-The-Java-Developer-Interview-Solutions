package exceptionHandled;

public class TestException {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int a = 15/0;
        }catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
        System.out.println("Program End");
    }
}
