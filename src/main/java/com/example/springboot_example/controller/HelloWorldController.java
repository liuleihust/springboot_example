package com.example.springboot_example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot_example
 * @description:
 * @author: liulei
 * @create: 2019-03-13 16:26
 **/

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

}
