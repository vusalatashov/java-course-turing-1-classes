package az.edu.turing.module01.lesson07;

import java.util.Arrays;

public class MaxNumberApp {
    public static void main(String[] args) {
        //input
//        String[] names = new String[5];
//        names[0] = "Turing";
//        names[1] = "Turing";
//        names[2] = "Turing";
//        names[3] = "Turing";
//        names[4] = "Turing";
//        System.out.println(Arrays.toString(names));
//        names[4]="Faxri";
//        System.out.println(names);
        int [][] numbers = new int[2][2];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[0][0]);
            }
        }

    }
}
