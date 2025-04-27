package az.edu.turing.springdemo2.controller;


import az.edu.turing.springdemo2.model.dto.StudentDto;
import az.edu.turing.springdemo2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAllStudents (){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudentById (@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public void createStudent (@RequestBody StudentDto studentDto){
        studentService.saveStudent(studentDto);
    }

    @PutMapping("/{id}")
    public void updateStudent (@PathVariable Long id, @RequestBody StudentDto studentDto){
        studentDto.setId(id);
        studentService.updateStudent(studentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent (@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
