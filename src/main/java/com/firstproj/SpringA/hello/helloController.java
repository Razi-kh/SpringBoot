package com.firstproj.SpringA.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloController {

    @RequestMapping("/hello")
    public String sayhi(){
        return "hi!";
    }


}
