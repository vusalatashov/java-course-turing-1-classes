package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class OperationApp {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result = "";

        //proses
        if (value % 3 == 0) {
            result = "Ədəd 3-ə tam bölünür";
        } else if (value % 3 == 1) {
            result = "Ədəd 3-ə tam bölünmür və qalıq 1-dir";
        } else {
            result = "Ədəd 3-ə tam bölünmür və qalıq 2-dir";
        }
        //output
        System.out.println(result);
    }
}
