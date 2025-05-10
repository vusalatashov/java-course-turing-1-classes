package az.edu.turing.springdemo2.service.impl;

import az.edu.turing.springdemo2.domain.entity.CourseEntity;
import az.edu.turing.springdemo2.domain.entity.StudentEntity;
import az.edu.turing.springdemo2.domain.repository.StudentRepository;
import az.edu.turing.springdemo2.mapper.StudentMapper;
import az.edu.turing.springdemo2.model.dto.StudentDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {

    @Mock
    private StudentRepository studentRepository;

    @Mock
    private StudentMapper studentMapper;


    @InjectMocks
    private StudentServiceImpl studentService;


    private StudentDto studentDto;
    private StudentEntity studentEntity;
    private CourseEntity courseEntity;

    @BeforeEach
    void setUp() {
        courseEntity = new CourseEntity();
        courseEntity.setId(1L);
        courseEntity.setName("Java");

        studentDto = new StudentDto(1L, "John", "Doe", "john@example.com", "123456789", 1L, "Java");
        studentEntity = new StudentEntity("John", "Doe", "john@example.com", "123456789", courseEntity);
        studentEntity.setId(1L);
    }

    @Test
    void saveStudent() {
        when(studentMapper.toEntity(studentDto)).thenReturn(studentEntity);
        when(studentRepository.save(studentEntity)).thenReturn(studentEntity);

        studentService.saveStudent(studentDto);

        verify(studentMapper).toEntity(studentDto);
        verify(studentRepository).save(studentEntity);
    }
    @Test
    void updateStudent() {
        when(studentMapper.toEntity(studentDto)).thenReturn(studentEntity);
        when(studentRepository.save(studentEntity)).thenReturn(studentEntity);

        studentService.updateStudent(studentDto);

        verify(studentMapper).toEntity(studentDto);
        verify(studentRepository).save(studentEntity);
    }

    @Test
    void deleteStudent() {
        Long studentId = 1L;

        studentService.deleteStudent(studentId);

        verify(studentRepository).deleteById(studentId);
    }

    @Test
    void getStudentById() {
        when(studentRepository.findById(1L)).thenReturn(Optional.of(studentEntity));
        when(studentMapper.toDto(studentEntity)).thenReturn(studentDto);

        StudentDto result = studentService.getStudentById(1L);

        assertEquals(studentDto, result);
        verify(studentRepository).findById(1L);
        verify(studentMapper).toDto(studentEntity);
    }

    @Test
    void getAllStudents() {
        List<StudentEntity> studentEntities = Arrays.asList(studentEntity);
        List<StudentDto> studentDtos = Arrays.asList(studentDto);

        when(studentRepository.findAll()).thenReturn(studentEntities);
        when(studentMapper.toDto(studentEntities)).thenReturn(studentDtos);

        List<StudentDto> result = studentService.getAllStudents();

        assertEquals(studentDtos, result);
        verify(studentRepository).findAll();
        verify(studentMapper).toDto(studentEntities);
    }
    @Test
    void testGetAllStudents_EmptyList() {
        when(studentRepository.findAll()).thenReturn(Collections.emptyList());
        when(studentMapper.toDto(Collections.emptyList())).thenReturn(Collections.emptyList());

        List<StudentDto> result = studentService.getAllStudents();

        assertTrue(result.isEmpty());
        verify(studentRepository).findAll();
        verify(studentMapper).toDto(Collections.emptyList());
    }
}
