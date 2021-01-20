package dblur.springsecurity.dao;

import dblur.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
