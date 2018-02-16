package com.urang.dockerplay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DockerplayController {
  
  @RequestMapping("/")
  public @ResponseBody String index() {
    return "Hello World";
  }
}
