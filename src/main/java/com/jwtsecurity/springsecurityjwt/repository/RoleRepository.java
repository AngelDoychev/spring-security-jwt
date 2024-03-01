package com.jwtsecurity.springsecurityjwt.repository;

import com.jwtsecurity.springsecurityjwt.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String user);
}
