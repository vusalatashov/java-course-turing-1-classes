package az.edu.turing.springdemo2.service.impl;

import az.edu.turing.springdemo2.domain.entity.StudentEntity;
import az.edu.turing.springdemo2.domain.repository.StudentRepository;
import az.edu.turing.springdemo2.model.dto.StudentDto;
import az.edu.turing.springdemo2.mapper.StudentMapper;
import az.edu.turing.springdemo2.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public void saveStudent(StudentDto studentDto) {
        StudentEntity student = studentMapper.toEntity(studentDto);
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        StudentEntity student = studentMapper.toEntity(studentDto);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto getStudentById(Long id) {
        return studentMapper.toDto(studentRepository.findById(id).orElse(null));
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentMapper.toDto(studentRepository.findAll());
    }
}
