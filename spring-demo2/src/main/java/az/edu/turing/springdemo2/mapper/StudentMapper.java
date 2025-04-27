package az.edu.turing.springdemo2.mapper;

import az.edu.turing.springdemo2.domain.entity.StudentEntity;
import az.edu.turing.springdemo2.model.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDto, StudentEntity> {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
    @Override
    StudentEntity toEntity(StudentDto studentDto);

    @Override
    List<StudentEntity> toEntity(List<StudentDto> studentDtoList);

    @Override
    StudentDto toDto(StudentEntity student);

    @Override
    List<StudentDto> toDto(List<StudentEntity> studentList);
}
