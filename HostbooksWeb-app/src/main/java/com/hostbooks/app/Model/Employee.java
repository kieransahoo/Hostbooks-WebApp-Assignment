package com.hostbooks.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @NotNull(message = "FirstName cannot be null")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name should only contain alphabets")
    private String firstName;
    @NotNull(message = "LastName cannot be null")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Name should only contain alphabets")
    private String lastName;
    @Email(message = "Email cannot be null")
    private String email;

}
