package ru.ant.springbootcrud.service;

import ru.ant.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);
    void saveUser(User user);
    List<User> getAllUser();
    void deleteUser(Long id);
}
