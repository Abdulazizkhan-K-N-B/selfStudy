package com.aknb.signuplogin.auth.dto;

import javax.validation.constraints.NotBlank;

import com.aknb.signuplogin.validation.ValidEmail;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResetPasswordDto {
    
    @ValidEmail(message = "Email is invalid!")
    @NotBlank(message = "Email is mandatory")
    private String email;
}
