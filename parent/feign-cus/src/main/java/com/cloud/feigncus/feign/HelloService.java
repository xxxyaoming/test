package com.cloud.feigncus.feign;

import com.cloud.feigncus.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
//@FeignClient("eurekaclient1")
//public interface HelloService {
//
//    @RequestMapping("/hello")
//    String hello();
//
//    @RequestMapping("/print")
//    String print(@RequestParam("msg") String msg);
//
//    @RequestMapping("/getuserbyid")
//    User getUser(@RequestParam("id") Integer id);
//
//    @RequestMapping("/getuserinfo")
//    String getUserInfo(@RequestBody User user);
//}
