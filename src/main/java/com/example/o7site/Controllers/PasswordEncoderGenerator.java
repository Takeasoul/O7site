package com.example.o7site.Controllers;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "1234";
        String encodedPassword = passwordEncoder.encode(password);

        System.out.println(encodedPassword);
    }
}
