package az.edu.turing.module02.part02.lesson24;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3,4},
                {5, 6,7,8},
                {9,10,11,12}};
        int[][] result = rotate(arr);
        System.out.println(Arrays.deepToString(result));


    }

    public static int[][] rotate(int[][] arr) {
        int[][] result = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[j][arr.length - 1 - i] = arr[i][j];
            }
        }
        return result;
    }
}
