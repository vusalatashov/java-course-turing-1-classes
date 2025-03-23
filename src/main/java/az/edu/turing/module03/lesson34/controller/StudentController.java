package az.edu.turing.module03.lesson34.controller;

import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.service.StudentService;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void save(StudentDto studentDto) {
        studentService.save(studentDto);
    }
}
