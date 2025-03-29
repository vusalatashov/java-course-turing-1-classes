package az.edu.turing.module03.lesson34.service.impl;

import az.edu.turing.module03.lesson34.dao.StudentDao;
import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.helper.LoggerHelper;
import az.edu.turing.module03.lesson34.model.StudentEntity;
import az.edu.turing.module03.lesson34.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl  implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save(StudentDto studentDto) {
        if (studentDto.getAge()<17) {
            LoggerHelper.error("Student age is less than 17");
            return;
        }
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setAge(studentDto.getAge());
        studentEntity.setGpa(studentDto.getGpa());
        studentDao.save(studentEntity);
    }

    @Override
    public List<StudentDto> getAll() {
        List<StudentEntity> studentEntities = studentDao.findAll();
        return studentEntities.stream()
                .map(studentEntity -> new StudentDto(
                        studentEntity.getId(),
                        studentEntity.getName(),
                        studentEntity.getSurname(),
                        studentEntity.getAge(),
                        studentEntity.getGpa()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public void update(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setAge(studentDto.getAge());
        studentEntity.setGpa(studentDto.getGpa());
        studentDao.update(studentEntity);

    }

    @Override
    public void delete(long id) {
        studentDao.delete(id);
    }
    @Override
    public StudentDto findById(long id) {
        StudentEntity studentEntity = studentDao.findById(id);
        return new StudentDto(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getSurname(),
                studentEntity.getAge(),
                studentEntity.getGpa()
        );
    }
    @Override
    public void updateNameById(long id, String name) {
        studentDao.updateNameById(id, name);
    }
}
