package az.edu.turing.module02.part02.lesson25;

public class SortingApp {
    public static void main(String[] args) {
        int num=3;
        //5*4*3*2*1
        //5*4!
        int result=factorial(num);
        System.out.println(result);
        //int[ ]a={1,2,3,4,5,6,7,8,9}

    }
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        // return 3*2*factorial(1)
        return num*factorial(num-1);
    }


}

