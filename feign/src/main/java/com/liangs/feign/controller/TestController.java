package com.liangs.feign.controller;

import com.liangs.feign.service.SeraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liangs on 2018/4/26.
 */

@RestController
public class TestController {

    @Autowired
    SeraService seraService;
    @RequestMapping("/test")
    public String test(){
        return seraService.test();
    }
}
