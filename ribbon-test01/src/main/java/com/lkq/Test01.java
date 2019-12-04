package com.lkq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableHystrix//熔断器

@EnableCircuitBreaker
@EnableFeignClients//feign客户端
public class Test01 {

    public static void main(String[] args) {
        SpringApplication.run(Test01.class);
    }

    //健康检查
    @RequestMapping("health")
    public String test41(){
        System.out.println("----------health检查----------");
        return "health-ok";
    }

}
