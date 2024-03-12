package net.acceltech.springopenshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/getMessage")
    public String findMessage(){
        return "Hello World from git public repository!";
    }
}
