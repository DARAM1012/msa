package com.pmh.ex10.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

@Configuration
public class jpaAuditConfig {

    @Bean
    public AuditorAware<String> auditorAware(){

        AuditorAware<String> auditorAware =
                () -> Optional.of("다람이");

        return auditorAware;
    }
}
