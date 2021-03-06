package edu.eci.arsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw"})
public class LiveCodingApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiveCodingApplication.class, args);
    }
}