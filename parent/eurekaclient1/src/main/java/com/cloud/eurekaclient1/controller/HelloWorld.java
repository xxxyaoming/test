package com.cloud.eurekaclient1.controller;

import com.cloud.eurekaclient1.dto.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! 21313123123123123";
    }

    @RequestMapping("/print")
    public String print(@RequestParam("msg") String msg) {
        return "received msg:" + msg;
    }

    @RequestMapping("/getuserbyid")
    public User getUser(@RequestParam("id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(18);
        user.setAddr("成都");
        user.setEmail("1@qq.com");
        return user;
    }

    @RequestMapping("/getuserinfo")
    public String getUserInfo(@RequestBody User user) {
        return user.toString();
    }
}
