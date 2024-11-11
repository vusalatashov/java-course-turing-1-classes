package az.edu.turing.module01.lesson07;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        //input
        String[] names = new String[6];
        names[0] = "T";
        names[1] = "u";
        names[2] = "r";
        names[3] = "i";
        names[4] = "n";
        names[5] = "g";
        String[] names2 = new String[6];
        for (String name : names) {
            System.out.println(name);
        }
    }
}
