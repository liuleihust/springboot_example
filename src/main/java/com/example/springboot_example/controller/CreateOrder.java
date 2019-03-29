package com.example.springboot_example.controller;

import com.example.springboot_example.service.OrderServices;
import com.example.springboot_example.service.StockServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_example
 * @description:
 * @author: liulei
 * @create: 2019-03-29 20:21
 **/


@RestController
public class CreateOrder {

    @Autowired
    private  OrderServices orderServices;
    @Autowired
    private  StockServices stockServices;



    @RequestMapping("/createOrder/{sid}")
    public String createOrders(@PathVariable Long sid){
        int sale = stockServices.getSale(sid);
        int count = stockServices.getCount(sid);
        if(sale== count){
            return "库存不足";
        }else {
            orderServices.createOrder(sid,"shouji");
            return "添加成功";
        }

    }
}
