package com.example.springcloud.consulorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderServiceApplication.class, args);
    }

}
