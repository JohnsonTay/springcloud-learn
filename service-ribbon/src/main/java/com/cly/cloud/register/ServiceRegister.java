package com.cly.cloud.register;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Filename ServiceRegister.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/9/27 10:12</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service
public class ServiceRegister {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
