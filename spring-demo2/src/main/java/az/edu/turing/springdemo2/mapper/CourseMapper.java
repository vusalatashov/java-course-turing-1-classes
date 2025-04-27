package az.edu.turing.springdemo2.mapper;

import az.edu.turing.springdemo2.domain.entity.CourseEntity;
import az.edu.turing.springdemo2.model.dto.CourseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<CourseDto, CourseEntity> {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Override
    CourseEntity toEntity(CourseDto courseDto);

    @Override
    List<CourseEntity> toEntity(List<CourseDto> courseDtoList);

    @Override
    CourseDto toDto(CourseEntity course);

    @Override
    List<CourseDto> toDto(List<CourseEntity> courseList);
}
