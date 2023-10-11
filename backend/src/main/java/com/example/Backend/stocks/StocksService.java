package com.example.Backend.stocks;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StocksService {
    StocksRepository stocksRepository;

    @Autowired
    public StocksService(StocksRepository stocksRepository) {
        this.stocksRepository = stocksRepository;
    }

    public String getMessage() {
        Optional<Stocks> stocksOptional = stocksRepository.findById((long) 1);
        if (stocksOptional.isPresent()) {
            return stocksOptional.get().getMessage();
        }
        return "Error getting record";
    }

}
