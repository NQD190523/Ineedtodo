package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {

     @Autowired
    private UserService userService;
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal OAuth2User principal, Model model) {
        if(principal != null){
            String name = principal.getAttribute("name");
            String email = principal.getAttribute("email");

            userService.processUserData(name, email);
            
            model.addAttribute("name", name);
            model.addAttribute("email", email);

        }
        return "Hello World, Secured";
    }
    
}
