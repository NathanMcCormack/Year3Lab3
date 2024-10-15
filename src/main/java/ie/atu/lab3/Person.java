package ie.atu.lab3;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Person {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    @Size(max = 10, message = "Employee ID cannot be greater than 10 characters")
    private String employeeId;

    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;

    @Email(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;
}
