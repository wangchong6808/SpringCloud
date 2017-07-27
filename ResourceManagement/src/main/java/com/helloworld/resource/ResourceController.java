package com.helloworld.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResourceController {


    @Value("${server.port}")
    private int port;

    @Value("${config.label}")
    private String label;


    @RequestMapping("/resource")
    public String home() {
        return "Hello World Resource" + port + " label:"+label;
    }

    /*public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }*/

}