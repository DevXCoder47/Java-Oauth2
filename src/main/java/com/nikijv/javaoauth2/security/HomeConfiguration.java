package com.nikijv.javaoauth2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.*;

@Configuration
public class HomeConfiguration {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        auth -> {
                            auth.requestMatchers("/home").permitAll();
                            auth.anyRequest().authenticated();
                        }
                )
                .oauth2Login(withDefaults())
                .formLogin(withDefaults())
                .build();
    }
}
