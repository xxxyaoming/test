package com.cloud.feigncus.controller;

import com.cloud.clientapi.dto.User;
import com.cloud.feigncus.feign.ApiHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@RestController
public class ApiHelloController {

    @Autowired
    private ApiHelloService apiHelloService;

    @RequestMapping("/apihello")
    public String hello() {
        return apiHelloService.hello();
    }

    @RequestMapping("/apiprint")
    public String print(@RequestParam("msg") String msg) {
        return apiHelloService.print(msg);
    }

    @RequestMapping("/apigetuserbyid")
    public User getUser(@RequestParam("id") Integer id) {
        return apiHelloService.getUser(id);
    }

    @RequestMapping("/apigetuserinfo")
    public String getUserInfo(@RequestBody User user) {
        return apiHelloService.getUserInfo(user);
    }
}
