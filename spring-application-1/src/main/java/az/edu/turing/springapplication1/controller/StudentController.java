package az.edu.turing.springapplication1.controller;

import az.edu.turing.springapplication1.model.Student;
import az.edu.turing.springapplication1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable long id, @RequestBody Student student) {
        student.setId(id);
        return studentService.updateStudent(student);
    }
}
