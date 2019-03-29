package com.example.springboot_example.service;

import com.example.springboot_example.model.Stock;
import com.example.springboot_example.model.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @program: springboot_example
 * @description: stock服务
 * @author: liulei
 * @create: 2019-03-29 20:10
 **/

@Service
public class StockServices {

    @Autowired
    private StockRepository stockRepository;

    public void save(){
        stockRepository.save(new Stock("shouji",10,0,0));
    }
    public Integer getCount(Long sid){
       return stockRepository.findById((long)sid).getCount();
    }

    public Integer getSale(Long sid){
        Stock stock = stockRepository.findById((long)sid);
       return stock.getSale();
    }
}
