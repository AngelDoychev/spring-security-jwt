package com.jwtsecurity.springsecurityjwt.service.impl;

import com.jwtsecurity.springsecurityjwt.model.entity.UserEntity;
import com.jwtsecurity.springsecurityjwt.repository.UserRepository;
import com.jwtsecurity.springsecurityjwt.service.UserEntityService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserEntityServiceImpl implements UserEntityService {
    private final UserRepository userEntityRepository;

    public UserEntityServiceImpl(UserRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public boolean isEmpty() {
        return this.userEntityRepository.count() == 0;
    }

    @Override
    public void saveAll(List<UserEntity> users) {
        this.userEntityRepository.saveAll(users);
    }

    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return this.userEntityRepository.findByUsername(username);
    }
}
