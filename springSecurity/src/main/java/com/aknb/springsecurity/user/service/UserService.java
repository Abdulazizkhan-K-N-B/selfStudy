package com.aknb.springsecurity.user.service;

import com.aknb.springsecurity.role.Role;
import com.aknb.springsecurity.user.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
