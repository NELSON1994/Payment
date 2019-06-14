package com.payment.demo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.payment.demo.entities.Users;
import com.payment.demo.models.LoginRequest;
import com.payment.demo.models.RegisterRequest;
import com.payment.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
//
// import java.util.Date;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class UserService implements UserServiceInterface{

    @Override
    public Map<String,Object> login(LoginRequest request){
        Map<String,Object> map = new HashMap<>();
        Optional<Users> Ouser=userRepository.findByUsernameAndPassword(request.getUsername(),bCryptPasswordEncoder.encode(request.getPassword()));
        if(!Ouser.isPresent()){
            map.put("status",001) ;
            map.put("message", "User exist");
            return map;
        }
      Users us=Ouser.get();
        map.put("username",us.getUsername());
        map.put("lastname",us.getLastname());
        map.put("firstname",us.getFirstname());
        map.put("message","Succesfull login credentials");
        map.put("status",200);
        return  map;
    }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

   // private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public Map <String,Object> register(RegisterRequest request){


        Map<String,Object> map = new HashMap<>();
        Users user=new Users();
        user.setFirstname(request.getFirstname());
        user.setUsername(request.getUsername());
        user.setCreatedon(new Date(System.currentTimeMillis()));

        user.setEmail(request.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
        userRepository.save(user);
        map.put("status", "00");
        map.put("message","Registration Sucessful");
        return map;
    }

}
