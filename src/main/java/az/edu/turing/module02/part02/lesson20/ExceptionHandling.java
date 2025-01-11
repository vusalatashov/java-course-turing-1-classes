package az.edu.turing.module02.part02.lesson20;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;


public class ExceptionHandling {
    public static void main(String[] args)  {
        try{
            ExceptionHandling.ageCheck(4);
        } catch (AgeIllegalException e) {
            System.out.println("error");
//            System.out.println(e.getMessage());
        }

    }
//    public static int divide(int a, int b) {
//        if(b == 0) {
//            throw new NullPointerException(" by zero");
//        } else if (b==4) {
//            throw new ArithmeticException("by 4");
//        }
//
//        return a / b;
//    }

    public static Integer ageCheck(int age) {
        if(age < 18) {
            throw new AgeIllegalException("Age is less than 18");
        }
        if (age > 100) {
            throw new NumberFormatException("Age is more than 100");
        }
        return age;
    }
}
