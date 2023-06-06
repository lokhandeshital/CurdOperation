package com.bikkadit.CurdOperation.controller;

import com.bikkadit.CurdOperation.model.User;
import com.bikkadit.CurdOperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        User user1 = this.userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    //update
    @PutMapping("/user/userId")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long userId){
        User user1 = this.userService.updateUser(user, userId);
        return new ResponseEntity<>(user1,HttpStatus.OK);

    }

    //get
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = this.userService.getAllUser();
        return new ResponseEntity<>(allUser,HttpStatus.OK);
    }

    //delete
    @DeleteMapping("/user/userId")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId){
        this.userService.deleteUser(userId);
        return new ResponseEntity<>("User Deleted Successfully",HttpStatus.OK);
    }
}
