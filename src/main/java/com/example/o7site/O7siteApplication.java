package com.example.o7site;

import com.example.o7site.Controllers.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfig.class)
public class O7siteApplication {

    public static void main(String[] args) {
        SpringApplication.run(O7siteApplication.class, args);
    }
}
