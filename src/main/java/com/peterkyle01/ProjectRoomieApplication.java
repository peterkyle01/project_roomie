package com.peterkyle01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.peterkyle01")
public class ProjectRoomieApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProjectRoomieApplication.class, args);
    }


}
