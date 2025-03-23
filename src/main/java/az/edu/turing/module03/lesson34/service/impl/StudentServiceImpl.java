package az.edu.turing.module03.lesson34.service.impl;

import az.edu.turing.module03.lesson34.dao.StudentDao;
import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.helper.LoggerHelper;
import az.edu.turing.module03.lesson34.model.StudentEntity;
import az.edu.turing.module03.lesson34.service.StudentService;

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
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setAge(studentDto.getAge());
        studentEntity.setGpa(studentDto.getGpa());
        studentDao.save(studentEntity);
    }
}
