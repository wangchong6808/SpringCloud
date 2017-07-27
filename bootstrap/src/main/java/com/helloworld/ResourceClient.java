package com.helloworld;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sampleApp")
public interface ResourceClient {

    @RequestMapping(method = RequestMethod.POST, value = "/resource")
    String getResource();
}
