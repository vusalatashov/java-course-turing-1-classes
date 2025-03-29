package az.edu.turing.module03.lesson34.controller;

import az.edu.turing.module03.lesson34.dto.StudentDto;
import az.edu.turing.module03.lesson34.model.StudentEntity;
import az.edu.turing.module03.lesson34.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class StudentController extends HttpServlet {

    private final StudentService studentService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("id") != null) {
            long id = Long.parseLong(req.getParameter("id"));
            StudentDto student = studentService.findById(id);
            String jsonResponse = objectMapper.writeValueAsString(student);
            resp.setContentType("application/json");
            resp.getWriter().write(jsonResponse);
            resp.setStatus(HttpServletResponse.SC_CREATED);
            return;
        }
        List<StudentDto> students = studentService.getAll();
        String jsonResponse = objectMapper.writeValueAsString(students);
        resp.setContentType("application/json");
        resp.getWriter().write(jsonResponse);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        StudentDto student = objectMapper.readValue(reader, StudentDto.class);
        studentService.save(student);
        resp.setStatus(HttpServletResponse.SC_CREATED);
        resp.getWriter().write("{\"message\": \"Student saved successfully\"}");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("id") != null && req.getParameter("name") != null) {
            long id = Long.parseLong(req.getParameter("id"));
            String name = req.getParameter("name");
            studentService.updateNameById(id, name);
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("{\"message\": \"Student name updated successfully\"}");
            return;
        }
        BufferedReader reader = req.getReader();
        StudentDto student = objectMapper.readValue(reader, StudentDto.class);
        studentService.update(student);
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("{\"message\": \"Student updated successfully\"}");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id = Long.parseLong(req.getParameter("id"));
        studentService.delete(id);
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write("{\"message\": \"Student deleted successfully\"}");
    }

}

