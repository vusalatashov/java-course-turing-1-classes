package az.edu.turing.module02.part01.lesson10;

public class StudentApp {

        public static void main(String[] args) {
            int a= 5;
            String b = new String("Hello");

            Student student2 = new Student("Ali", "Aliyev", 24);
            System.out.println("Student2:" +student2.age);
            Student student1 = new Student("Ali", "Aliyev", 25);
            System.out.println("Student1:"+student1.age);
            System.out.println("Student2:" +student2.age);

        }
        public static int sum(int a){
            return a+5;
        }
}
