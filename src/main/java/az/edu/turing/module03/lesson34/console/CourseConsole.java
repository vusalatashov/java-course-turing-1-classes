package az.edu.turing.module03.lesson34.console;

import az.edu.turing.module03.lesson34.controller.StudentController;
import az.edu.turing.module03.lesson34.dao.StudentDao;
import az.edu.turing.module03.lesson34.dao.impl.StudentDaoImpl;
import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.helper.ScannerHelper;
import az.edu.turing.module03.lesson34.service.StudentService;
import az.edu.turing.module03.lesson34.service.impl.StudentServiceImpl;

public class CourseConsole {
    static final StudentDao studentDao = new StudentDaoImpl();
    static final StudentService studentService = new StudentServiceImpl(studentDao);
    static final StudentController studentController = new StudentController(studentService);

    public static void run() {

       while (true){
           switch (ScannerHelper.getInt()){
               case 1:
                     saveStudent();
                   break;
               default:
                   System.out.println("Invalid option");
           }
       }
    }

    public static void saveStudent() {
        StudentDto studentDto = new StudentDto();
        System.out.println("Enter student id, name, surname, age, gpa");
        studentDto.setId(ScannerHelper.getInt());
        studentDto.setName(ScannerHelper.getString());
        studentDto.setSurname(ScannerHelper.getString());
        studentDto.setAge(ScannerHelper.getInt());
        studentDto.setGpa(ScannerHelper.getDouble());
        studentController.save(studentDto);
    }
}
