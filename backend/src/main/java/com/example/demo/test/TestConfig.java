package com.example.demo.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean
    CommandLineRunner commandLineRunner(TestRepository testRepository) {
        return args -> {
            testRepository.save(new Test("Hello World"));
        };
    }

}
