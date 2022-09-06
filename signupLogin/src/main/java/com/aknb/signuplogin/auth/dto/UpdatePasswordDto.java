package com.aknb.signuplogin.auth.dto;

import com.aknb.signuplogin.validation.PasswordMatches;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@PasswordMatches
public class UpdatePasswordDto {
    
    private String email;

    private String oldPassword;

    private String password;

    private String matchingPassword;
}
