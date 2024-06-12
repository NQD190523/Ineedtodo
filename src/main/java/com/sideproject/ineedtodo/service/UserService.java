package com.sideproject.ineedtodo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sideproject.ineedtodo.model.User;
import com.sideproject.ineedtodo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user)  {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public void processUserData(String name, String email) {
        // Implement your business logic here
        System.out.println("User name: " + name);
        System.out.println("User email: " + email);
        if(userRepository.findByEmail(email) == null){
            User user = new User();
            user.setFullName(name);
            user.setEmail(email);
            userRepository.save(user);
        }
    }
}
