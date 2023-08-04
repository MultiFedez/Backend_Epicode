package com.epicode.gestione_device.security.service;

import com.epicode.gestione_device.security.payload.LoginDto;
import com.epicode.gestione_device.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
