package com.aknb.signuplogin.auth.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.aknb.signuplogin.validation.PasswordMatches;
import com.aknb.signuplogin.validation.ValidEmail;
import lombok.Getter;

@Getter
@PasswordMatches(message = "Password should be the same!")
public class RegistrationDto {

    @NotBlank(message = "Firstname is mandatory!")
    @Size(max = 50, message = "Firstname size should be about 50")
    private String firstname;

    @Size(max = 50, message = "Lastname size should be about 50")
    @NotBlank(message = "Lastname is mandatory!")
    private String lastname;

    @ValidEmail(message = "Email not valid")
    @NotBlank(message = "Email is mandatory!")
    private String email;

    @NotBlank(message = "Password is mandatory!")
    private String password;

    @NotBlank(message = "Matching Password is mandatory!")
    private String matchingPassword;
}