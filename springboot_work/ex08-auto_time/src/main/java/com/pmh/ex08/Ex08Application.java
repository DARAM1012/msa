package com.pmh.ex08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;


@SpringBootApplication
@EnableJpaAuditing
public class Ex08Application {

    public static void main(String[] args) {


        ApplicationContext applicationContext
                = SpringApplication.run(Ex08Application.class, args);

//        Arrays.stream(applicationContext.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }
}

