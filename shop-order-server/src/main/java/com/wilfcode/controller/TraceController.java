package com.wilfcode.controller;


import com.wilfcode.service.impl.SentinelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TraceController {
    @Autowired
    private SentinelServiceImpl sentinelService;

    @RequestMapping("/trace1")
    public String trace1() {
        sentinelService.tranceService();
        return "trace1";
    }

    @RequestMapping("/trace2")
    public String trace2() {
        sentinelService.tranceService();
        return "trace2";
    }



}
