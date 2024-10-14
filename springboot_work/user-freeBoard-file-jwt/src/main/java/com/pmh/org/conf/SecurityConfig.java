package com.pmh.org.conf;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

//    private final AuthenticationConfiguration authenticationConfiguration;
//    private final JWTManager jwtManager;

    // 인증 -> UserDetailsService
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf( csrf -> csrf.disable() );
        http.formLogin( form -> form.disable());
        http.httpBasic( basic -> basic.disable());

        http.authorizeRequests( auth -> auth.requestMatchers("/**").permitAll() );

//                .requestMatchers( "/","/login", "/join",  "/freeboard/**","/user/**" ,"/file/**").permitAll()
//                .requestMatchers( "/swagger-ui/**", "/v3/api-docs/**" ).permitAll()
//                .requestMatchers("/test/**").permitAll()
//                .requestMatchers("/admin").hasRole("ADMIN")
//                .anyRequest().authenticated() );

        // JWTFilter JWT 토큰 검사...
//        http.addFilterBefore(new JWTFilter(jwtManager), LoginFilter.class);
        // 로그인을 하는...
        // UsernamePasswordAuthenticationFilter -> LoginFilter
        // login 주소 요청이 들어오면... email password 비교 jwt-> 틀렸다...
//        http.addFilterAt( new LoginFilter(
//                                authenticationManager(authenticationConfiguration), jwtManager),
//                                UsernamePasswordAuthenticationFilter.class );

        http.sessionManagement( session -> session.sessionCreationPolicy( SessionCreationPolicy.STATELESS ));

        return http.build();
    }

}
