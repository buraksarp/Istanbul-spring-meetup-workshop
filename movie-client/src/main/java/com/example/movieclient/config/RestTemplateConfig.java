package com.example.movieclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RefreshScope
public class RestTemplateConfig {

    @Value("${rest-template.root.URI}")
    String rootURI;

    @Value("${rest-template.connection.timeout}")
    int connectTimeout;

    @Value("${rest-template.read.timeout}")
    int readTimeout;

    @Bean
    @RefreshScope
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        RestTemplate restTemplate = restTemplateBuilder
                .rootUri(rootURI)
                .setConnectTimeout(connectTimeout)
                .setReadTimeout(readTimeout)
                .build();

        return restTemplate;

    }
}
