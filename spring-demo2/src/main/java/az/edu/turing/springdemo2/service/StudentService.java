package az.edu.turing.springdemo2.service;

import az.edu.turing.springdemo2.model.dto.StudentDto;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long id);

    StudentDto getStudentById(Long id);

    List<StudentDto> getAllStudents();
}
