package com.urang.dockerplay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DockerplayController {
  
  @RequestMapping("/")
  public String index() {
    return "index";
  }
  
}
