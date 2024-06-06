package com.sideproject.ineedtodo.model;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class CustomOAuth2User implements OAuth2User, OidcUser {

    private OAuth2User oAuth2User;
    private OidcUser oidcUser;

    public CustomOAuth2User(OidcUser oidcUser) {
        this.oidcUser = oidcUser;
    }

    public CustomOAuth2User(OAuth2User oAuth2User) {
        this.oAuth2User = oAuth2User;
    }

    @Override
    public Map<String, Object> getAttributes() {
        if(oidcUser != null) return oidcUser.getAttributes();
        return oAuth2User.getAttributes();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(oidcUser != null) return oAuth2User.getAuthorities();
        return oAuth2User.getAuthorities();
    }

    @Override
    public String getName() {
        if (oidcUser != null) return oAuth2User.getAttribute("name");
        return oAuth2User.getAttribute("name");
    }

    public String getEmail() {
        if(oidcUser != null) return oAuth2User.getAttribute("email");
        return oAuth2User.getAttribute("email");
    }

    @Override
    public Map<String, Object> getClaims() {
       if(oidcUser != null) return oidcUser.getClaims();
       return null;
    }

    @Override
    public OidcUserInfo getUserInfo() {
       if(oidcUser != null) return oidcUser.getUserInfo();
       return null;
    }

    @Override
    public OidcIdToken getIdToken() {
      if(oidcUser != null) return oidcUser.getIdToken();
      return null;
    }

}
