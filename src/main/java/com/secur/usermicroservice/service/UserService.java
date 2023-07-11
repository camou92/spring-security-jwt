package com.secur.usermicroservice.service;

import com.secur.usermicroservice.entities.Role;
import com.secur.usermicroservice.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
}
