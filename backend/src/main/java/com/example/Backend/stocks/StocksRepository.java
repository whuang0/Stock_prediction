package com.example.Backend.stocks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stocks, Long> {

}
