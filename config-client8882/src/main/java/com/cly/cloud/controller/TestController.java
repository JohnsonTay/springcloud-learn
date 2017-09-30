package com.cly.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Filename TestController.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/28 17:34</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
public class TestController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hello")
    public String hello(){
        return foo;
    }

}
