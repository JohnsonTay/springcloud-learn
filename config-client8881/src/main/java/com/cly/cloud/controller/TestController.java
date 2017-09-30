package com.cly.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjzj_ on 2017/9/27.
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
