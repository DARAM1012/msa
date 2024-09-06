package org.pmh.conf;

import org.pmh.components.AA;
import org.pmh.components.BB;
import org.pmh.components.CC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconf {
    @Bean
    public AA a(){
        return new AA();
    }

    @Bean
    public BB bb(){
        return new BB();
    }

    @Bean
    public CC cc(){
        return new CC();
    }
}
