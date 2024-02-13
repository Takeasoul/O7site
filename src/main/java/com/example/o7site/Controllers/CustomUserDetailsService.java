package com.example.o7site.Controllers;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service

public class CustomUserDetailsService implements UserDetailsService {
    private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("Trying to authenticate user: {}", username);
        if ("admin".equals(username)) {
            // Пользователь "admin" с паролем "1234" и ролью "ADMIN"
            return org.springframework.security.core.userdetails.User
                    .withUsername(username)
                    .password("$2a$10$sLoSjvbo8UuBXQA3zgEQ/.VtrzXYC465jsvNaBjjpE8UQjFUr8PbK") // Замените на зашифрованный пароль
                    .roles("ADMIN")
                    .build();
        } else {
            // Замените этот код на соответствующий код для вашего приложения, чтобы загрузить других пользователей из базы данных или других источников данных
            // Важно вернуть объект UserDetails, например, объект org.springframework.security.core.userdetails.User
            return org.springframework.security.core.userdetails.User
                    .withUsername(username)
                    .password("$2a$10$sLoSjvbo8UuBXQA3zgEQ/.VtrzXYC465jsvNaBjjpE8UQjFUr8PbK") // Замените на зашифрованный пароль
                    .roles("USER")
                    .build();
        }
    }

}

