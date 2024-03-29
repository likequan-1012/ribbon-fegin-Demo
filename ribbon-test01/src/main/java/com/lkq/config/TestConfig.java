package com.lkq.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
public class TestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
       return  new RestTemplate();
    }


    @Bean
    public IRule getRule(){
      return new RoundRobinRule();
    }

}
