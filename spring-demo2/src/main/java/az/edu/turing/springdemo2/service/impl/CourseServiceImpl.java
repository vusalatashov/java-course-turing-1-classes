package az.edu.turing.springdemo2.service.impl;

import az.edu.turing.springdemo2.domain.entity.CourseEntity;
import az.edu.turing.springdemo2.domain.repository.CourseRepository;
import az.edu.turing.springdemo2.model.dto.CourseDto;
import az.edu.turing.springdemo2.mapper.CourseMapper;
import az.edu.turing.springdemo2.service.CourseService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void saveCourse(CourseDto courseDto) {
        CourseEntity course = courseMapper.toEntity(courseDto);
        courseRepository.save(course);
    }

    @Override
    public void updateCourse(CourseDto courseDto) {
        CourseEntity existingCourse = courseRepository.findById(courseDto.getId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        existingCourse.setName(courseDto.getName());


        courseRepository.save(existingCourse); // Bu entity artıq attached olacaq
    }


    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public CourseDto getCourseById(Long id) {
        return courseMapper.toDto(courseRepository.findById(id).orElse(null));
    }

    @Override
    public List<CourseDto> getAllCourses() {
        return courseMapper.toDto(courseRepository.findAll());
    }
}
