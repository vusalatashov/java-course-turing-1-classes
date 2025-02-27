package az.edu.turing.module02.part02.lesson30;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException {
        Student student1 = new Student("Günel", 20);
        Class<?> studentClass = Student.class;

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType());
        }
        System.out.println(fields[0].get(null));
        System.out.println(fields[1].get(null));
        System.out.println(fields[2].get(null));
    }
}
