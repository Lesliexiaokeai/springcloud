package com.leslie.springcloud.cfgbeans;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
