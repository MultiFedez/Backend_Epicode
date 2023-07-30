package com.epicode.gestione_p.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.gestione_p.model.Edificio;
import com.epicode.gestione_p.model.Postazione;
import com.epicode.gestione_p.model.Prenotazione;
import com.epicode.gestione_p.model.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class GestionePrenotazioniConfig {

	@Bean("UtenteBean")
	@Scope("prototype")
	public Utente utente() {
		return new Utente();
	}
	
	@Bean("PrenotazioneBean")
	@Scope("prototype")
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}

	@Bean("PostazioneBean")
	@Scope("prototype")
	public Postazione postazione() {
		return new Postazione();
	}
	
	@Bean("EdificioBean")
	@Scope("prototype")
	public Edificio edificio() {
		return new Edificio();
	}
}
