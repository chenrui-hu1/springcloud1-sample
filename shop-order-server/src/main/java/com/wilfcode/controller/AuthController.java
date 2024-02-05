package com.wilfcode.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthController {

    @RequestMapping("/auth1")

    public String auth1(String serviceName) {
        log.info("auth1 + serviceName={}", serviceName);
        return "auth1";
    }
}
