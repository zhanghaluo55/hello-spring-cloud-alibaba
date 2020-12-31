package com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.service;

import com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2020/12/29 18:06
 */
@FeignClient(name = "nacos-provider", fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);

    @GetMapping(value = "/cnmbd")
    String lb();
}
