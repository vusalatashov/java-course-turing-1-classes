package az.edu.turing.springapplication1.model;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;

    @NonNull
    @Size(min = 3)
    private String name;
}
