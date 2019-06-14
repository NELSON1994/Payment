package com.payment.demo.controllers;


import com.payment.demo.services.mpesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MpesaController {

    @Autowired
    private mpesaService service;

    @RequestMapping(value = "/generateToken", method = RequestMethod.POST)
    public ResponseEntity <Object> generateToken(){
        //Map<String,Object> response= new HashMap<>();
            Map<String,Object> response= service.simulateC2B();
            return new ResponseEntity (response ,HttpStatus.OK );



    }
}
