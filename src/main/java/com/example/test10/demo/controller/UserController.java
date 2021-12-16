package com.example.test10.demo.controller;

import com.example.test10.demo.entity.User;
import com.example.test10.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll (){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<User> save (@RequestBody User user){
        return ResponseEntity.ok(userService.save(user));
    }
}
