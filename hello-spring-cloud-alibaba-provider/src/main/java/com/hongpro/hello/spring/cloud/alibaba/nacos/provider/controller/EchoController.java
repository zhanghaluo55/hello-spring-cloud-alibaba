package com.hongpro.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2020/12/29 15:04
 */
@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/cnmbd")
    public String lb(){
        return "Hello Nacos Provider i am form port: " + port;
    }


    @GetMapping("/echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos Provider " + string;
    }


}
