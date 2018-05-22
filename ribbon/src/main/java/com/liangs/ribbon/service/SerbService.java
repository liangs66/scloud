package com.liangs.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liangs on 2018/4/26.
 */

@Service
public class SerbService {

    @Autowired
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorback")
    public String test(){
        return restTemplate.getForObject("http://SERVICE-B/test",String.class);
    }
    public String errorback(){
        return "hi,"+"sorry,error!";
    }
}
