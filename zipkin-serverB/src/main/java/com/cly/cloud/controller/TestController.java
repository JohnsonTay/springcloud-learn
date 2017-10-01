package com.cly.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ Filename TestController.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/30 18:42</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/helloB")
    public String info(){
        logger.info("I just call B,and then refer to A");
        return restTemplate.getForObject("http://localhost:8988/A",String.class);
    }

    @RequestMapping("/B")
    public String home(){
        logger.info("B is being called");
        return "hi i'm server-B!";
    }

}
