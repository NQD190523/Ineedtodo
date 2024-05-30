package com.sideproject.ineedtodo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests( auth -> {
                auth.requestMatchers("/").permitAll();
                auth.anyRequest().authenticated();
        })
        .oauth2Login(oauth2Login ->
        oauth2Login
            .defaultSuccessUrl("/secured")
            .failureUrl("/login?error=true")
    )
        .formLogin(Customizer.withDefaults())
        .build();
    }
}
