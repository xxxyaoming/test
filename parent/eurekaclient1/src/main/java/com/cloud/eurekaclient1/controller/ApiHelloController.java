package com.cloud.eurekaclient1.controller;

import com.cloud.clientapi.dto.User;
import com.cloud.clientapi.service.HelloService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@RestController
public class ApiHelloController implements HelloService {
    @Override
    public String hello() {
        return "api hello";
    }

    @Override
    public String print(String msg) {
        return "api received msg:" + msg;
    }

    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(18);
        user.setAddr("成都");
        user.setEmail("1@qq.com");
        return user;
    }

    @Override
    public String getUserInfo(User user) {
        return "api " + user.toString();
    }
}
