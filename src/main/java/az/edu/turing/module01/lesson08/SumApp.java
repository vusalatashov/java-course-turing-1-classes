package az.edu.turing.module01.lesson08;

public class SumApp {

    public static void main(String[] args) {

        int[] nums1 = {5, 6};
        int[] nums2 = {5, 5};


        cem(nums1);


    }

    public static void cem(int[] vekils) {
        int sum=vekils[0]+vekils[1];
        System.out.println(sum);
    }
}
