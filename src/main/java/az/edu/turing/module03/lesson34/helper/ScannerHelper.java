package az.edu.turing.module03.lesson34.helper;

import java.util.Scanner;

public class ScannerHelper {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        return scanner.nextInt();
    }

    public static String getString() {
        return scanner.next();
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

}
