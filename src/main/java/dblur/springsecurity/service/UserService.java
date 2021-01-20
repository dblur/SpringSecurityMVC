package dblur.springsecurity.service;

import dblur.springsecurity.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);
    void delete(Long id);
    void edit(User user);

    User findByUsername(String username);
    User findById(Long id);
}
