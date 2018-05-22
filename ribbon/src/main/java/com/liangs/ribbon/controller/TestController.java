package com.liangs.ribbon.controller;

import com.liangs.ribbon.service.SerbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangs on 2018/4/26.
 */

@RestController
public class TestController {

    @Autowired
    public SerbService serbService;

    @RequestMapping("/test")
    public String test(){
        return serbService.test();
    }
}
