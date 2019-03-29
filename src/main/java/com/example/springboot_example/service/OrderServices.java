package com.example.springboot_example.service;

import com.example.springboot_example.model.Orders;
import com.example.springboot_example.model.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;

/**
 * @program: springboot_example
 * @description: 订单服务
 * @author: liulei
 * @create: 2019-03-29 20:02
 **/

@Service
public class OrderServices {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServices(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(Long sid,String name){
        Date date = new Date();
        DateFormat dateFormat=new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formattedDate = dateFormat.format(date);
        orderRepository.save(new Orders(sid,name,formattedDate));
    }
}
