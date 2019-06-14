package com.payment.demo.services;

import com.payment.demo.models.LoginRequest;
import com.payment.demo.models.RegisterRequest;

import java.util.Map;

public interface UserServiceInterface {
    public Map<String,Object> register(RegisterRequest request);
    public Map<String,Object> login(LoginRequest request);


}
