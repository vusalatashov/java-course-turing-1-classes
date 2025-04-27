package az.edu.turing.springdemo2.service;

import az.edu.turing.springdemo2.model.dto.CourseDto;

import java.util.List;

public interface CourseService {
    void saveCourse(CourseDto courseDto);

    void updateCourse(CourseDto courseDto);

    void deleteCourse(Long id);

    CourseDto getCourseById(Long id);

    List<CourseDto> getAllCourses();
}
