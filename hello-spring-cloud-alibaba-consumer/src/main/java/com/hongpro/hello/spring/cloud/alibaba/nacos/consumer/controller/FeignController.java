package com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.controller;

import com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2020/12/29 18:05
 */
@RefreshScope
@RestController
public class FeignController {
    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/fegin/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return echoService.echo(string);
    }

    @GetMapping(value = "/lb")
    public String lb() {
        return echoService.lb();
    }

    @GetMapping(value = "/name")
    public String getUsername() {
        return username;
    }

}
