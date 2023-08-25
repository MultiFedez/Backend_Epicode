package com.epicode.systemFire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.systemFire.model.Sonda;

@Configuration
public class SondaConfiguration {

	@Bean("sondaBean")
	@Scope("prototype")
	public Sonda sonda() {
		return new Sonda();
	}	
}
