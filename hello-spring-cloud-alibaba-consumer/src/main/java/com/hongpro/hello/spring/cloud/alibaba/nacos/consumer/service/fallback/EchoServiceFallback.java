package com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.service.fallback;

import com.hongpro.hello.spring.cloud.alibaba.nacos.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author zhangzihong
 * @data 2020/12/30 17:03
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String string) {
        return "你得网络有问题";
    }

    @Override
    public String lb() {
        return "请联系管理员";
    }
}
