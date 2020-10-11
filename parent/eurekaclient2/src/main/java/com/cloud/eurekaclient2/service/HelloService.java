package com.cloud.eurekaclient2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@Service
public class HelloService {
    @Autowired private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hellofallback")
    public String hello() {
        return "这是HelloService调用eurekaclient1的返回结果：" + restTemplate.getForObject("http://EUREKACLIENT1/hello", String.class);
    }

    public String hellofallback() {
        return "服务降级处理方法";
    }
}
