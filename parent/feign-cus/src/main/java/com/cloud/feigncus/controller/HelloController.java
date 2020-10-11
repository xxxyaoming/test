package com.cloud.feigncus.controller;

import com.cloud.feigncus.dto.User;
import com.cloud.feigncus.feign.HelloService;
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
public class HelloController {

//    @Autowired
//    private HelloService helloService;
//
//    @RequestMapping("/feignhello")
//    public String hello() {
//        return helloService.hello();
//    }
//
//    @RequestMapping("/print")
//    public String print(@RequestParam("msg") String msg) {
//        return helloService.print(msg);
//    }
//
//    @RequestMapping("/getuserbyid")
//    public User getUser(@RequestParam("id") Integer id) {
//        return helloService.getUser(id);
//    }
//
//    @RequestMapping("/getuserinfo")
//    public String getUserInfo(@RequestBody User user) {
//        return helloService.getUserInfo(user);
//    }

}
