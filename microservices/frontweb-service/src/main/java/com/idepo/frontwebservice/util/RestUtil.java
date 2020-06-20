package com.idepo.frontwebservice.util;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestUtil {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
