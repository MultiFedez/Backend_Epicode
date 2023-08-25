package com.epicode.systemFire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.systemFire.model.GestioneCentrale;

@Configuration
public class GestioneCentraleConfiguration {
	@Bean("gestioneCentraleBean")
	@Scope("prototype")
	public GestioneCentrale gestioneCentrale() {
		return new GestioneCentrale();
	}
}
