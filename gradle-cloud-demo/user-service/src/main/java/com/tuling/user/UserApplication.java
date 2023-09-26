package com.tuling.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.tuling.user.mapper")
@SpringBootApplication
@EnableDiscoveryClient////开启服务发现客户端 也就是nacosServer的客户端
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
