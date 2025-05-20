package com.example.Spring_base_project.Service;

import com.example.Spring_base_project.Entity.User;
import java.util.List;

public interface IUser {
    List<User> getUsers();
    User getUser(Long id);
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User getUserByFirstName(String firstName);
}
