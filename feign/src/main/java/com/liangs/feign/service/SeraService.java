package com.liangs.feign.service;

import com.liangs.feign.service.hystrix.SeraHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liangs on 2018/4/26.
 */

@FeignClient(value = "service-a",fallback = SeraHystrix.class)
public interface SeraService {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}
