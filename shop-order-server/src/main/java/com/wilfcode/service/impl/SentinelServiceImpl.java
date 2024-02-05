package com.wilfcode.service.impl;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service

public class SentinelServiceImpl {

    @SentinelResource(value = "tranceService")
    public String tranceService() {
        return "tranceService";
    }
}
