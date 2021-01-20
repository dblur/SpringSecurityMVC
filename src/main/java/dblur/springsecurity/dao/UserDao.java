package dblur.springsecurity.dao;

import dblur.springsecurity.model.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {
    List<User> findAll();

    User findByUsername(String username);
    User findOne(Long id);

    void delete(Long id);

    //TODO edit user func
    //TODO сделать нормальную edit jsp

}
