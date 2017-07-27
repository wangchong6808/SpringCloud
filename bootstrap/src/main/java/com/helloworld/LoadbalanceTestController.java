package com.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/load")
public class LoadbalanceTestController {

    @Autowired
    ResourceClient resourceClient;

    @Value("${config.label}")
    private String label;

    @GetMapping
    public String getResource(){
        return resourceClient.getResource()+ " loadLabel:"+label;
    }
}
