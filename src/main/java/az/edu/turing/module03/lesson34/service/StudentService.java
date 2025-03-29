package az.edu.turing.module03.lesson34.service;

import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.model.StudentEntity;

import java.util.List;

public interface StudentService {

    void save (StudentDto studentDto);

    List<StudentDto> getAll();
    void update(StudentDto studentDto);
    void delete(long id);
    StudentDto findById(long id);
    void updateNameById(long id, String name);
}
