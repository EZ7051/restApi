package com.ejaz.rest.controller;

import com.ejaz.rest.model.User;
import com.ejaz.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ejazahmed
 * @version 1.0
 * @since 13/01/24
 * <p>
 * Description: Brief description of the file or class.
 */

@RestController
@RequestMapping("/api/users")
@DependsOn("User")
public class UserDbController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User created successfully";
    }
}
