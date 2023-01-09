package org.example.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("org.example")
public class OperatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(OperatorApplication.class, args);
    }
}