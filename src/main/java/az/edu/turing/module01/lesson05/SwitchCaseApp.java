package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String result = "";

        //proses
        switch (value % 3) {
            case 0:
                result = "Ədəd 3-ə tam bölünür";
                break;
            case 1:
                result = "Ədəd 3-ə tam bölünmür və  qalıq 1-dir";
                break;
            case 2:
                result = "Ədəd 3-ə tam bölünmür və qalıq 2-dir";
                break;
            default:
                result = "Ədəd 3-ə tam bölünmür və qalıq " + value % 3 + "-dir";
        }

        //output
        System.out.println(result);
    }
}
