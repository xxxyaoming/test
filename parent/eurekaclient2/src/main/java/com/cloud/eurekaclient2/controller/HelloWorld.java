package com.cloud.eurekaclient2.controller;

import com.cloud.eurekaclient2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@RestController
public class HelloWorld {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return "这是调用eurekaclient1的返回结果ggggggggggggggggggggggggggggggggggggg：" + restTemplate.getForObject("http://EUREKACLIENT1/hello", String.class);
    }

    @RequestMapping("/hellos")
    public String hellos() {
        return helloService.hello();
    }

}
