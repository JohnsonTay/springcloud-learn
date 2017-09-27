package com.cly.cloud.controller;

import com.cly.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Filename TestController.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 10:16</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
public class TestController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String testHello(@RequestParam String name){
        return helloService.testService(name);
    }

}
