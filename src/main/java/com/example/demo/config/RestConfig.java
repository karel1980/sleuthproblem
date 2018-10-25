package com.example.demo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.context.WebApplicationContext.SCOPE_REQUEST;

@Configuration
public class RestConfig {

    @Bean
    @Scope(scopeName=SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }
}
