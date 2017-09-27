package com.cly.cloud.register;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Filename FeignServiceTest.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 14:20</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service
@FeignClient(value = "service-test", fallback = SchedualServiceHiHystric.class)
public interface FeignServiceTest {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
