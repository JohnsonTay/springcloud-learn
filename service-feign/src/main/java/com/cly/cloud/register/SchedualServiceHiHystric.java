package com.cly.cloud.register;

import org.springframework.stereotype.Service;

/**
 * @ Filename SchedualServiceHiHystric.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 15:43</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service
public class SchedualServiceHiHystric implements FeignServiceTest{

    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry,"+name;
    }
}
