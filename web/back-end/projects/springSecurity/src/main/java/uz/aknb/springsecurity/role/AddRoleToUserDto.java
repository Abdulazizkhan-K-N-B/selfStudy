package uz.aknb.springsecurity.role;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddRoleToUserDto {
    private String roleName;
    private String userName;
}
