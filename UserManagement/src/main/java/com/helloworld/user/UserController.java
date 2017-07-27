package com.helloworld.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    public String home() {
        return "Hello World User";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }*/

}