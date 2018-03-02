package com.urang.dockerplay;

import com.urang.dockerplay.exception.TestException;
import com.urang.dockerplay.service.AspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerplayController {

    @Autowired
    private AspectService aspectService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/null")
    public void executeException(){
        throw new TestException("TEST");
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(aspectService.getHelloMessage());
        return "Hello worldsladlsald";
    }

    @ResponseBody
    @RequestMapping("/sleep")
    public String sleep() throws InterruptedException {
        System.out.println(aspectService.sleep());
        return "sleelelelep";
    }

}
