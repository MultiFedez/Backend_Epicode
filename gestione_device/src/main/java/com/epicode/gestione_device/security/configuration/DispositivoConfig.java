package com.epicode.gestione_device.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.gestione_device.security.entity.Laptop;
import com.epicode.gestione_device.security.entity.Smartphone;
import com.epicode.gestione_device.security.entity.Tablet;

@Configuration
public class DispositivoConfig {

	@Bean("tabletBean")
	@Scope("prototype")
	public Tablet tablet() {
		return new Tablet();
	}
	
	@Bean("smartphoneBean")
	@Scope("prototype")
	public Smartphone smartphone() {
		return new Smartphone();
	}
	
	@Bean("laptopBean")
	@Scope("prototype")
	public Laptop laptop() {
		return new Laptop();
	}
}
