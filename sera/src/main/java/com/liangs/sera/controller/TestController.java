package com.liangs.sera.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangs on 2018/4/26.
 */

@RestController
@RefreshScope
public class TestController {

    @Value("${server.port}")
    public String port;
    @Value("${server.a}")
    public String a;
    @RequestMapping("/test")
    public String test(){
        return "ser-aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+port;
    }
}
