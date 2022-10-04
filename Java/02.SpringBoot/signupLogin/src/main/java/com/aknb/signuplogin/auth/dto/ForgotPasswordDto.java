package com.aknb.signuplogin.auth.dto;

import javax.validation.constraints.NotBlank;

import com.aknb.signuplogin.validation.PasswordMatches;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PasswordMatches
public class ForgotPasswordDto {
    
    @NotBlank
    private String token;
    
    private String password;

    private String matchingPassword;
}
