package com.wilfcode.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController

public class SentinelController {

    @RequestMapping("/sentinel1")
    public String sentinel1() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "sentinel1";
    }

    @RequestMapping("/sentinel2")
    public String sentinel2() {
        return "sentinel2";
    }

    @RequestMapping("/sentinel3")
    public String sentinel3() {
        return "sentinel3";
    }
}
