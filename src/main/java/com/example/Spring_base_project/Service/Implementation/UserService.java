package com.example.Spring_base_project.Service.Implementation;

import com.example.Spring_base_project.Entity.User;
import com.example.Spring_base_project.Repositery.UserRepositery;
import com.example.Spring_base_project.Service.IUser;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUser {

    private final UserRepositery userRepositery;

    public UserService(UserRepositery userRepositery) {
        this.userRepositery = userRepositery;
    }

    @Override
    public List<User> getUsers() {
        return userRepositery.findAll();
    }

    @Override
    public User getUser(Long id) {
        Optional<User> optionalUser = userRepositery.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public User addUser(User user) {
        return userRepositery.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepositery.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepositery.deleteById(id);

    }

    @Override
    public User getUserByFirstName(String firstName) {
        return userRepositery.findByFirstName(firstName);
    }
}
