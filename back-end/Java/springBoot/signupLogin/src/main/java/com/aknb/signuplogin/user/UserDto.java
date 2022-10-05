package com.aknb.signuplogin.user;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    
    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Set<UserRole> userRoles;

    private Boolean locked = false;

    private Boolean enabled = false;
}