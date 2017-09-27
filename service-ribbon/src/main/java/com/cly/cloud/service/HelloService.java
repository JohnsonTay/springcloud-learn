package com.cly.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Filename HelloService.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 10:13</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testError")
    public String testService(String name){
        return restTemplate.getForObject("http://SERVICE-TEST/test?name="+name, String.class);
    }

    private String testError(String name){
        return "test,"+name+",sorry,error!";
    }
}
