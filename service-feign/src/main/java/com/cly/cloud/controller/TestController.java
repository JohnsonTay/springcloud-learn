package com.cly.cloud.controller;

import com.cly.cloud.register.FeignServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Filename TestController.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 14:22</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
public class TestController {

    @Autowired
    private FeignServiceTest feignServiceTest;

    @RequestMapping("/hello")
    public String testFeign(@RequestParam String name){
        return feignServiceTest.sayHiFromClientOne(name);
    }
}
