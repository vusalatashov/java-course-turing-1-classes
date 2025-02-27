package az.edu.turing.module02.part02.lesson23;

public class ArrHelper {

    public int[] findEven(int[] arr) {
        int[] evenArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = evenArr[i];
        }
        return result;
    }

    public int[] dividedByTen(int[] arr) {
        int[] dividedArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                dividedArr[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = dividedArr[i];
        }
        return result;
    }
}
