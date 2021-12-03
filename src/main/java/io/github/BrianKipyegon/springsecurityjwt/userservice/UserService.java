package io.github.BrianKipyegon.springsecurityjwt.userservice;

import io.github.BrianKipyegon.springsecurityjwt.model.Role;
import io.github.BrianKipyegon.springsecurityjwt.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String rolename);
    User getUser(String username);
    List<User> getUsers();
}
