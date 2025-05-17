package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdminUserController {

    @Autowired
    UserService userService;

    @GetMapping("/getusers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/adduser")
    public User addNewUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserByIs(@PathVariable Long id) {
         userService.deleteUserById(id);
    }

    @GetMapping("/getuser/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }



}
