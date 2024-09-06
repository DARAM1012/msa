package org.pmh;

import org.pmh.conf.Myconf2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Myconf2.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

    }
}
