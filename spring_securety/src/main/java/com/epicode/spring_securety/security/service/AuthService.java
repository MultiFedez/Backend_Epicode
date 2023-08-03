package com.epicode.spring_securety.security.service;

import com.epicode.spring_securety.security.payload.LoginDto;
import com.epicode.spring_securety.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
