package com.example.springboot_example.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StockRepository  extends JpaRepository<Stock,Long> {

    Stock findById(long id);
}
