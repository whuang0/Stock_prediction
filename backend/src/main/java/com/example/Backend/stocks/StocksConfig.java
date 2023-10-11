package com.example.Backend.stocks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StocksConfig {
    @Bean
    CommandLineRunner commandLineRunner(StocksRepository stocksRepository) {
        return args -> {
            stocksRepository.save(new Stocks("Hello World"));
        };
    }

}
