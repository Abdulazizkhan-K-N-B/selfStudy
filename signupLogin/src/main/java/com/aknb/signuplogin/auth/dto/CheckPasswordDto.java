package com.aknb.signuplogin.auth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckPasswordDto {
    private String email;

    private String oldPassword;

    public CheckPasswordDto(){

    }

    public CheckPasswordDto(String email, String oldPassword){

        this.email = email;
        this.oldPassword = oldPassword;
    }
}
