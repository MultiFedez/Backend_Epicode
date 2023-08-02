package com.epicode.gestione_p2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.epicode.gestione_p2.model.Edificio2;
import com.epicode.gestione_p2.model.Postazione2;
import com.epicode.gestione_p2.model.Prenotazione2;
import com.epicode.gestione_p2.model.Utente2;

@Configuration
@PropertySource("classpath:application.properties")
public class GestionePrenotazione2Config {

	@Bean("UtenteBean")
	@Scope("prototype")
	public Utente2 utente() {
		return new Utente2();
	}
	
	@Bean("PrenotazioneBean")
	@Scope("prototype")
	public Prenotazione2 prenotazione() {
		return new Prenotazione2();
	}

	@Bean("PostazioneBean")
	@Scope("prototype")
	public Postazione2 postazione() {
		return new Postazione2();
	}
	
	@Bean("EdificioBean")
	@Scope("prototype")
	public Edificio2 edificio() {
		return new Edificio2();
	}
}


