package com.jwtsecurity.springsecurityjwt.service;

import com.jwtsecurity.springsecurityjwt.model.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserEntityService {
    boolean isEmpty();

    void saveAll(List<UserEntity> users);

    Optional<UserEntity> findByUsername(String username);
}
