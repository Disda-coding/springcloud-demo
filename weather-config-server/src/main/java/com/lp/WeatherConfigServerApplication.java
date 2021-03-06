package com.lp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer //开启配置服务器
@EnableDiscoveryClient
@SpringBootApplication
public class WeatherConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherConfigServerApplication.class, args);
    }

}