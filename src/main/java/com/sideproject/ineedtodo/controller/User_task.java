package com.sideproject.ineedtodo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sideproject.ineedtodo.component.JwtUtil;
import com.sideproject.ineedtodo.dto.LoginRequest;
import com.sideproject.ineedtodo.dto.LoginResponse;
import com.sideproject.ineedtodo.model.User;
import com.sideproject.ineedtodo.service.CustomUserDetailsService;
import com.sideproject.ineedtodo.service.UserService;

import io.micrometer.core.ipc.http.HttpSender.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/auth")
public class User_task {

    @Autowired
    private UserService userService;

    @Autowired
    private CustomUserDetailsService userDetailsService;


    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user/email")
    public ResponseEntity<User> getUserByEmail(@ RequestBody Map<String, String> request) {
        String email = request.get("email");
        User user = userService.getUserByEmail(email);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/signup")
    public User addUser(@RequestBody User user) {
        // login(user);
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login (@RequestBody LoginRequest loginRequest, Authentication authentication) {
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        } catch (AuthenticationException e) {
            // Return an unauthorized response in case of authentication failure
            Map<String, Object> map = new HashMap<>();
            map.put("Message", "Bad credential");
            map.put("status",false);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        String jwtToken = jwtUtil.generateTokenFromUserName(userDetails);

        List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority()).toList();

        LoginResponse response = new LoginResponse(jwtToken, userDetails, roles);

        return ResponseEntity.ok(response);

    }

}
