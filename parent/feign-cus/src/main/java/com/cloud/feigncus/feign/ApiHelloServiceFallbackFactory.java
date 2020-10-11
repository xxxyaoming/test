package com.cloud.feigncus.feign;

import com.cloud.clientapi.dto.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@Component
public class ApiHelloServiceFallbackFactory implements FallbackFactory<ApiHelloService> {
    @Override
    public ApiHelloService create(Throwable throwable) {
        return new ApiHelloService() {
            @Override
            public String hello() {
                return "hello error";
            }

            @Override
            public String print(String msg) {
                return "print error";
            }

            @Override
            public User getUser(Integer id) {
                return new User();
            }

            @Override
            public String getUserInfo(User user) {
                return "getUserInfo error";
            }
        };
    }
}
