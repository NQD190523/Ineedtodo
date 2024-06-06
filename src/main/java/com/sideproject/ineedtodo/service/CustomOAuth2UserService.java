package com.sideproject.ineedtodo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.sideproject.ineedtodo.model.CustomOAuth2User;
import com.sideproject.ineedtodo.model.CustomOidcUser;


@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User>{

    private static final Logger logger = LoggerFactory.getLogger(CustomOAuth2UserService.class); 

    @Override
    public OAuth2User loadUser (OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        logger.debug("Loading user information from Google");

        OAuth2UserService<OAuth2UserRequest, OAuth2User> delegate = new DefaultOAuth2UserService(); 
        OAuth2User oauth2User =  delegate.loadUser(userRequest);

        logger.debug("User information loaded: {}", oauth2User.getAttributes());

        // Check if the user is an OidcUser (OpenID Connect)
        if(oauth2User instanceof DefaultOidcUser){
            return new CustomOidcUser((DefaultOidcUser) oauth2User);
        }
         // Otherwise, treat it as a regular OAuth2 user
        return new CustomOAuth2User(oauth2User);
    }
}