package com.epicode.systemFire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.epicode.systemFire.model.SegnaleDiIncendio;

@Configuration
public class SegnaleDiIncendioConfiguration {
	@Bean("segnaleDiIncendioBean")
	@Scope("prototype")
	public SegnaleDiIncendio segnaleDiIncendio() {
		return new SegnaleDiIncendio();
	}
}
