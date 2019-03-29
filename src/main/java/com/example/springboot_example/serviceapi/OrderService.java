package com.example.springboot_example.serviceapi;

/**
 * @program: springboot_example
 * @description: 订单接口
 * @author: liulei
 * @create: 2019-03-29 16:52
 **/


public interface OrderService {
    /** 
    * @Description:  创建订单 
    * @Param: [sid] 
    * @return: int 
    * @Author: Liulei
    * @Date: 2019/3/29 
    */ 
    int createWrongOrder(int sid);
    /** 
    * @Description: 乐观锁 创建订单 
    * @Param: [sid] 
    * @return: int 
    * @Author: Liulei
    * @Date: 2019/3/29 
    */ 
    int createOptimisticOrder(int sid);
    
    /** 
    * @Description: 乐观锁创建订单，库存查Redis，减小DB 压力 
    * @Param: [sid] 
    * @return: int 
    * @Author: Liulei
    * @Date: 2019/3/29 
    */ 
    int createOptimisticOrderUseRedis(int sid);
    
    /** 
    * @Description: 乐观锁创建订单，库存查Redis,利用Kafka 异步写订单 
    * @Param: [sid] 
    * @return: void 
    * @Author: Liulei
    * @Date: 2019/3/29 
    */ 
    void createOptimisticOrderUseRedisAndKafka(int sid);
}
