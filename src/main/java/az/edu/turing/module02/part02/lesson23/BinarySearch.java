package az.edu.turing.module02.part02.lesson23;

public class BinarySearch {

    public static int recursiveBinarySearchHelper(int[] arr, int x, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) return mid;
        if (arr[mid] > x) return recursiveBinarySearchHelper(arr, x, low, mid - 1);
        return recursiveBinarySearchHelper(arr, x, mid + 1, high);
    }

    public static int recursiveBinarySearch(int[] arr, int x) {
        return recursiveBinarySearchHelper(arr, x, 0, arr.length - 1);
    }

    public static int iterativeBinarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return -1;

    }


    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static  String reverseString(String str) {
        if (str.isEmpty()) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        int a=factorial(5);
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = iterativeBinarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
