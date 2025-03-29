package az.edu.turing.module03.lesson34.dao.impl;

import az.edu.turing.module03.lesson34.config.DatabaseConfig;
import az.edu.turing.module03.lesson34.dao.StudentDao;
import az.edu.turing.module03.lesson34.helper.LoggerHelper;
import az.edu.turing.module03.lesson34.model.StudentEntity;
import az.edu.turing.module03.lesson34.query.StudentSqlQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void save(StudentEntity studentEntity) {
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.INSERT_STUDENT)) {
            ps.setString(1, studentEntity.getName());
            ps.setString(2, studentEntity.getSurname());
            ps.setInt(3, studentEntity.getAge());
            ps.setDouble(4, studentEntity.getGpa());
            ps.executeUpdate();
            LoggerHelper.info("Student saved successfully");
        } catch (Exception e) {
            LoggerHelper.error("Error saving student: " + e.getMessage());
        }
    }

    @Override
    public List<StudentEntity> findAll() {
        List<StudentEntity> students = new ArrayList<>();
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.SELECT_ALL_STUDENTS);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                StudentEntity student = new StudentEntity();
                student.setName(rs.getString("name"));
                student.setId(rs.getLong("id"));
                student.setSurname(rs.getString("surname"));
                student.setAge(rs.getInt("age"));
                student.setGpa(rs.getDouble("gpa"));
                students.add(student);
            }
            LoggerHelper.info("All students fetched successfully");
        } catch (Exception e) {
            LoggerHelper.error("Error fetching students: " + e.getMessage());
        }
        return students;
    }

    @Override
    public void update(StudentEntity studentEntity) {
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.UPDATE_STUDENT)) {
            ps.setString(1, studentEntity.getName());
            ps.setString(2, studentEntity.getSurname());
            ps.setInt(3, studentEntity.getAge());
            ps.setDouble(4, studentEntity.getGpa());
            ps.setLong(5, studentEntity.getId());
            ps.executeUpdate();
            LoggerHelper.info("Student updated successfully");
        } catch (Exception e) {
            LoggerHelper.error("Error updating student: " + e.getMessage());
        }
    }

    @Override
    public void delete(long id) {
        try(Connection connection = DatabaseConfig.getConnection()){
            PreparedStatement ps=connection.prepareStatement(StudentSqlQuery.DELETE_STUDENT);
            ps.setLong(1,id);
            ps.executeUpdate();
            LoggerHelper.info("Student deleted successfully");

        } catch (SQLException e) {;
            e.printStackTrace();
        }

    }
    @Override
    public StudentEntity findById(long id) {
        StudentEntity student = new StudentEntity();
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.SELECT_STUDENT_BY_ID)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student.setId(rs.getLong("id"));
                student.setName(rs.getString("name"));
                student.setSurname(rs.getString("surname"));
                student.setAge(rs.getInt("age"));
                student.setGpa(rs.getDouble("gpa"));
            }
            LoggerHelper.info("Student fetched by id successfully");
        } catch (Exception e) {
            LoggerHelper.error("Error fetching student by id: " + e.getMessage());
        }
        return student;
    }
    @Override
    public void updateNameById(long id, String name) {
        StudentEntity student = findById(id);
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.UPDATE_STUDENT_NAME_BY_ID)) {
            ps.setString(1, student.getName());
            ps.executeUpdate();
            LoggerHelper.info("Student updated successfully");
        } catch (Exception e) {
            LoggerHelper.error("Error patching student: " + e.getMessage());
        }
    }



}
