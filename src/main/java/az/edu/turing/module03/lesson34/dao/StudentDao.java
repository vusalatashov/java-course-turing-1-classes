package az.edu.turing.module03.lesson34.dao;

import az.edu.turing.module02.part02.lesson27.Student;
import az.edu.turing.module03.lesson34.model.StudentEntity;

import java.util.List;

public interface StudentDao {

   void save(StudentEntity studentEntity);

   List<StudentEntity> findAll();
   void update(StudentEntity studentEntity);
   void delete(long id);
   StudentEntity findById(long id);
   void updateNameById(long id, String name);
}
