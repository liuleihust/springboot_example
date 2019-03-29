package com.example.springboot_example;

import com.alibaba.fastjson.JSON;
import com.example.springboot_example.controller.HelloWorldController;
import com.example.springboot_example.controller.UserController;
import com.example.springboot_example.model.User;
import com.example.springboot_example.model.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.text.DateFormat;
import java.util.Date;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootExampleApplicationTests {

    private MockMvc mvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        Date date = new Date();
        DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.save(new User("a","aa","aa@qq.com","aa1",formattedDate));
        userRepository.save(new User("b","bb","bb@qq.com","bb1",formattedDate));
        userRepository.save(new User("c","cc","cc@qq.com","cc1",formattedDate));
    }


    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void contextLoads() throws Exception {

        mvc.perform(MockMvcRequestBuilders.get("/getUser").accept(MediaType.APPLICATION_JSON));
    }

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1(){
        stringRedisTemplate.opsForValue().set("aaa","111");
        System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void test2(){
        Date date = new Date();
        DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User user = new User("a","aa","aa@qq.com","aaa1",formattedDate);
        System.out.println(user.getId());
        stringRedisTemplate.opsForValue().set("a", JSON.toJSONString(user));
        System.out.println(stringRedisTemplate.opsForValue().get("a"));
        user = JSON.parseObject(stringRedisTemplate.opsForValue().get("a"),User.class);
        System.out.println(user.getId());

    }

    @Test
    public void test3(){

    }

}
