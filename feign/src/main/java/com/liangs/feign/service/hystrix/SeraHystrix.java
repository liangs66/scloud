package com.liangs.feign.service.hystrix;

import com.liangs.feign.service.SeraService;
import org.springframework.stereotype.Component;

/**
 * Created by liangs on 2018/4/26.
 */
@Component
public class SeraHystrix implements SeraService {
    @Override
    public String test() {
        return "hi,error!";
    }
}
