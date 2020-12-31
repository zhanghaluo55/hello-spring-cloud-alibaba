package com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2020/12/29 15:41
 */
@Configuration
public class ConsumerConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
