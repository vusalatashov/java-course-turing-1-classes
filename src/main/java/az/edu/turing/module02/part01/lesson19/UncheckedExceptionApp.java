package az.edu.turing.module02.part01.lesson19;

public class UncheckedExceptionApp {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
