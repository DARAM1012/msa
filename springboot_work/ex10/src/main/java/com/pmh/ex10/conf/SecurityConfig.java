package com.pmh.ex10.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //    DB에서도 비밀번호를 암호화하는 작업
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    //    설정한 경로만 접근을 허용하는 작업
    @Bean
    public SecurityFilterChain fFilterChain(HttpSecurity http) throws Exception {

//        사용하지 않겠다.
        http.csrf(csfr -> csfr.disable());
        http.formLogin(form -> form.disable());
        http.httpBasic(basic -> basic.disable());

        http.authorizeHttpRequests(auth -> auth
//                일반 사용자도 접근 가능하다.
                .requestMatchers("/login", "/join", "/", "freeboard/**", "/user/**").permitAll() // requestMatchers에 적은 경로는 허용한다는 함수.
//                admin으로 role을 가지고 있을 때 접근 가능하다.
                .requestMatchers("/admin").hasRole("ADMIN")
                .anyRequest()
                .authenticated());

        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return http.build();
    }
}

