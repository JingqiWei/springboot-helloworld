package com.example.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

}
