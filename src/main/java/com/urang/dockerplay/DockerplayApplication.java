package com.urang.dockerplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableLoadTimeWeaving;

@SpringBootApplication
@ComponentScan({"com.urang.dockerplay"})
public class DockerplayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerplayApplication.class, args);
    }
}
