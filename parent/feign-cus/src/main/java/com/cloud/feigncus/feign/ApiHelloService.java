package com.cloud.feigncus.feign;

import com.cloud.clientapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * Created By YaoMing.
 * Time: 2020/10/08.
 */
@FeignClient(value = "eurekaclient1", fallbackFactory = ApiHelloServiceFallbackFactory.class)
public interface ApiHelloService extends HelloService {
}
