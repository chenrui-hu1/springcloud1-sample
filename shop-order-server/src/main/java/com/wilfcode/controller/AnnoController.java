package com.wilfcode.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AnnoController {

    @RequestMapping("/anno1")
    @SentinelResource(value = "anno1", blockHandler = "blockHandler", fallback = "fallback")

    public String anno1(String serviceName) {
        log.info("anno1 + serviceName={}", serviceName);
        if("wilfcoder".equals(serviceName)) {
            throw new RuntimeException("wilfcoder");
        }
        return serviceName;
    }

    public String blockHandler(String serviceName) {
        log.error("blockHandler + serviceName={}", serviceName);
        return "blockHandler";
    }

    public String fallback(String serviceName) {
        log.error("fallback + serviceName={}", serviceName);
        return "fallback";
    }
}
