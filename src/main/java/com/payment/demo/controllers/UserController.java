package com.payment.demo.controllers;

import com.payment.demo.entities.Users;
import com.payment.demo.models.LoginRequest;
import com.payment.demo.models.RegisterRequest;
import com.payment.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public ResponseEntity <Object> login(){
        Map<String,Object> response= new HashMap<>();


        return new ResponseEntity ( response ,HttpStatus.OK );


    }
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterRequest registerRequest){
        Map<String,Object> res = new HashMap<>();
        res = userService.register(registerRequest);

        return  new ResponseEntity<>(res,HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest loginRequest){
        Map<String,Object> res = new HashMap<>();
        res = userService.login(loginRequest);

        return  new ResponseEntity<>(res,HttpStatus.OK);
    }

@GetMapping("/users")
 public ResponseEntity<Users> getUser(@RequestParam Long id){
      Users user= new Users();
      user.setId(id);
     user.setFirstname("nelson");
     user.setEmail("nelson gmail.com");
    return  ResponseEntity.ok(user);

 }

    @GetMapping("/name")
    public ResponseEntity getName() {
        return ResponseEntity.ok(new Users());
    }



}
