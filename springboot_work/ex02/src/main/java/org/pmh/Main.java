package org.pmh;


import org.pmh.components.AA;
import org.pmh.conf.Myconf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //객체를 하나 가지고 있으면 메모리 낭비가 줄어든다.
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Myconf.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        AA aa1 = applicationContext.getBean(AA.class);
        System.out.println(aa1);
        
        AA aa2 = applicationContext.getBean(AA.class);
        System.out.println(aa2);

        AA aa3 = new AA();
        AA aa4 = new AA();

        System.out.println("aa1 = "+aa1);
        System.out.println("aa2 = "+aa2);
        System.out.println("aa3 = "+aa3);
        System.out.println("aa4 = "+aa4);

        aa1.setName("스프링통안에 있는 객체");

        System.out.println();
        System.out.println("aa1 = "+aa1);
        System.out.println("aa2 = "+aa2);
        System.out.println("aa3 = "+aa3);
        System.out.println("aa4 = "+aa4);
    }
}