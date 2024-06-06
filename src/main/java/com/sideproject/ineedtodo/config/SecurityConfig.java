package com.sideproject.ineedtodo.config;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


import com.sideproject.ineedtodo.model.CustomOAuth2User;
import com.sideproject.ineedtodo.service.CustomOAuth2UserService;
import com.sideproject.ineedtodo.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private static final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);


    @Autowired
    private UserService userService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        logger.debug("Configuring security filter chain");
        return http
            .authorizeHttpRequests( auth -> {
                auth.requestMatchers("/").permitAll();
                auth.anyRequest().authenticated();
        })
        .oauth2Login(oauth2Login ->
        oauth2Login
            .defaultSuccessUrl("/secured",true)
            .failureUrl("/login?error=true")
            .userInfoEndpoint(userInfoEndpointConfig -> 
                userInfoEndpointConfig.userService(oauth2UserService()))
                .successHandler( new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                            Authentication authentication) throws IOException, ServletException {
                                CustomOAuth2User oAuth2User =  (CustomOAuth2User) authentication.getPrincipal();
                                logger.debug("User authenticated: {}", oAuth2User.getAttributes());
                                userService.processUserData(oAuth2User.getName(),oAuth2User.getEmail());
                                response.sendRedirect("/secured");
                    }
            }))
        .formLogin(Customizer.withDefaults())
        .build();
    }

    @Bean
    public OAuth2UserService<OAuth2UserRequest,OAuth2User> oauth2UserService() {
        logger.debug("Initializing CustomOAuth2UserService");
        return new CustomOAuth2UserService();
    }
}
