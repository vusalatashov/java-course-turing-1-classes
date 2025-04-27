package az.edu.turing.springapplication1.service;

import az.edu.turing.springapplication1.exception.StudentNotFoundException;
import az.edu.turing.springapplication1.model.Student;
import az.edu.turing.springapplication1.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public String deleteStudent(long id) {
       studentRepository.deleteById(id);
       return "Student deleted successfully!";
    }

    public Student getStudentById(long id) {
        Optional<Student >student = studentRepository.findById(id);
        return student.orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
    }
}
