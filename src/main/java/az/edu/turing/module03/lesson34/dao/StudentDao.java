package az.edu.turing.module03.lesson34.dao;

import az.edu.turing.module03.lesson34.model.StudentEntity;

import java.util.List;

public interface StudentDao {

   void save(StudentEntity studentEntity);

   List<StudentEntity> findAll();
}
