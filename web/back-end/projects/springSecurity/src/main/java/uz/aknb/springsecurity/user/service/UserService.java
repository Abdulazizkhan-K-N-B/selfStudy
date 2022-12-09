package uz.aknb.springsecurity.user.service;

import uz.aknb.springsecurity.role.Role;
import uz.aknb.springsecurity.user.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
