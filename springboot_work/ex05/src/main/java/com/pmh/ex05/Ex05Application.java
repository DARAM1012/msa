package com.pmh.ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Ex05Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = SpringApplication.run(Ex05Application.class, args);

//        Arrays.stream(applicationContext.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }

}

