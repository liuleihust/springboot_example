package com.example.springboot_example.service;

import com.example.springboot_example.serviceapi.OrderService;

/**
 * @program: springboot_example
 * @description: 订单服务实现
 * @author: liulei
 * @create: 2019-03-29 17:01
 **/


public class OrderSericeimp implements OrderService {
    @Override
    public int createWrongOrder(int sid) {
        return 0;
    }

    @Override
    public int createOptimisticOrder(int sid) {
        return 0;
    }

    @Override
    public int createOptimisticOrderUseRedis(int sid) {
        return 0;
    }

    @Override
    public void createOptimisticOrderUseRedisAndKafka(int sid) {

    }
}
