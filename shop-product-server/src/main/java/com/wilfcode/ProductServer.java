package com.wilfcode;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServer {
public static void main(String[] args) {
        SpringApplication.run(ProductServer.class, args);
    }
}