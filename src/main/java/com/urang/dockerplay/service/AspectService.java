package com.urang.dockerplay.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class AspectService {

    private String name = "jinsoo";

    public String getHelloMessage(){
        System.out.println("getHelloMessage");
        return "Hello " + this.name;
    }

    public String sleep() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("good");
        getHelloMessage();
        return "good sleep";
    }
}
