package az.edu.turing.springdemo2.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Long courseId;
    private String courseName;
}
