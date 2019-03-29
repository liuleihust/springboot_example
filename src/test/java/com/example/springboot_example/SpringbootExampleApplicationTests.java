package com.example.springboot_example;

import com.example.springboot_example.model.Stock;
import com.example.springboot_example.model.StockRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootExampleApplicationTests {

//    private MockMvc mvc;
//
    @Autowired
    private StockRepository stockRepository;
//
//    /**
//    * @Description: 测试 持久层
//    * @Param: []
//    * @return: void
//    * @Author: Liulei
//    * @Date: 2019/3/14
//    */
    @Test
    public void test(){
        stockRepository.save(new Stock("shouji",10,0,0));
    }
//
//
//    @Before
//    public void setUp() {
//        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
//    }
//
//    @Test
//    public void contextLoads() throws Exception {
//
//        mvc.perform(MockMvcRequestBuilders.get("/getUser").accept(MediaType.APPLICATION_JSON));
//    }
//
//
//    /**
//    * @Description: 加载redis bean ，StringRedisTemplate继承RedisTemplate。默认采用的是String的序列化策略
//    * @Param:
//    * @return:
//    * @Author: Liulei
//    * @Date: 2019/3/14
//    */
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//    /**
//    * @Description:  加载redis bean,RedisTemplate默认采用的是JDK的序列化策略，保存的key和value都是采用此策略序列化保存的。
//    * @Param:
//    * @return:
//    * @Author: Liulei
//    * @Date: 2019/3/14
//    */
//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    /**
//    * @Description: 测试redis 缓存
//    * @Param: []
//    * @return: void
//    * @Author: Liulei
//    * @Date: 2019/3/14
//    */
//    @Test
//    public void test1(){
//        stringRedisTemplate.opsForValue().set("aaa","111");
//        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
//    }
//
//    /**
//    * @Description:
//    * @Param: []
//    * @return: void
//    * @Author: Liulei
//    * @Date: 2019/3/14
//    */
//    @Test
//    public void test2(){
//        Date date = new Date();
//        DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//        User user = new User("a","aa","aa@qq.com","aaa1",formattedDate);
//        ValueOperations<String,User> operations= redisTemplate.opsForValue();
//        operations.set("1",user);
//        System.out.println(operations.get("1"));
//    }

}
