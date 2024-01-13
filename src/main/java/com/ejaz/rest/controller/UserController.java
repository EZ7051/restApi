package com.ejaz.rest.controller;

import com.ejaz.rest.model.User;
import com.ejaz.rest.model.SearchCriteria;
import org.springframework.web.bind.annotation.*;

/**
 * @author ejazahmed
 * @version 1.0
 * @since 13/01/24
 * <p>
 * Description: Brief description of the file or class.
 */
@RestController
@RequestMapping("/api/users/rest")
public class UserController {

    // GET endpoint to retrieve all users
    @GetMapping
    public String getAllUsers() {
        return "List of all users";
    }

    // GET endpoint with a path parameter to retrieve a specific user by ID
    @GetMapping("/{userId}")
    public String getUserById(@PathVariable Long userId) {
        return "User details for ID " + userId;
    }

    // POST endpoint to create a new user
    @PostMapping
    public String createUser(@RequestBody User user) {
        // Assume User class has properties like name, email, etc.
        // Implement logic to save the user to the database or perform other actions
        return "User created successfully";
    }

    // GET endpoint with query parameters to filter users
    @GetMapping("/filter")
    public String filterUsers(
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "email", required = false) String email) {
        // Implement logic to filter users based on parameters
        return "Filtered users: name=" + name + ", email=" + email;
    }

    // Example of a complex object as a request parameter
    @GetMapping("/search")
    public String searchUsers(@ModelAttribute SearchCriteria searchCriteria) {
        // Assume SearchCriteria class has properties like name, email, age, etc.
        // Implement logic to search users based on the criteria
        return "Search results: " + searchCriteria.toString();
    }

    // Example of handling multiple path parameters
    @GetMapping("/details/{category}/{userId}")
    public String getUserDetails(
            @PathVariable String category,
            @PathVariable Long userId) {
        return "User details for category " + category + ", ID " + userId;
    }

    // Assume additional API variations based on your application needs

}
