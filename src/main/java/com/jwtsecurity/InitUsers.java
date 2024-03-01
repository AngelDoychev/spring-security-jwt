package com.jwtsecurity;

import com.jwtsecurity.springsecurityjwt.model.entity.Role;
import com.jwtsecurity.springsecurityjwt.model.entity.UserEntity;
import com.jwtsecurity.springsecurityjwt.service.UserEntityService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitUsers implements ApplicationRunner {
    private final UserEntityService userEntityService;
    private final PasswordEncoder passwordEncoder;

    public InitUsers(UserEntityService userEntityService, PasswordEncoder passwordEncoder) {
        this.userEntityService = userEntityService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (this.userEntityService.isEmpty()) {
            UserEntity user = new UserEntity();
            user.setUsername("user");
            user.setPassword(this.passwordEncoder.encode("password"));
            Role userRole = new Role();
            userRole.setName("USER");
            user.setRoles(List.of(userRole));
            UserEntity admin = new UserEntity();
            admin.setUsername("admin");
            admin.setPassword(this.passwordEncoder.encode("password"));
            Role adminRole = new Role();
            adminRole.setName("USER");
            admin.setRoles(List.of(userRole, adminRole));
            this.userEntityService.saveAll(List.of(user, admin));
        }
    }
}
