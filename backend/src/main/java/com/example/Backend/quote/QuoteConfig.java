package com.example.Backend.quote;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuoteConfig {
    @Bean
    CommandLineRunner commandLineRunner(QuoteRepository quoteRepository) {
        return args -> {
            quoteRepository.save(new Quote("Hello World"));
        };
    }

}
