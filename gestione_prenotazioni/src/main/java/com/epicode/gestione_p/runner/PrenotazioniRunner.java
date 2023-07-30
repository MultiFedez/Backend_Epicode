package com.epicode.gestione_p.runner;

import java.time.LocalDate;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestione_p.model.Edificio;
import com.epicode.gestione_p.model.Postazione;
import com.epicode.gestione_p.model.Prenotazione;
import com.epicode.gestione_p.model.Tipo;
import com.epicode.gestione_p.model.Utente;
import com.epicode.gestione_p.service.EdificioService;
import com.epicode.gestione_p.service.PostazioneService;
import com.epicode.gestione_p.service.PrenotazioneService;
import com.epicode.gestione_p.service.UtenteService;

@Component
public class PrenotazioniRunner implements CommandLineRunner {

	@Autowired EdificioService es;
	@Autowired PostazioneService ps;
	@Autowired PrenotazioneService prse;
	@Autowired UtenteService uts;
	
	@Override
	public void run(String... args) throws Exception {
		  System.out.println("Runner");
		
	// Creazione Edifici da salvare nel DB
	Edificio e1 = es.createEdificio("Primo Edificio","Viale dell Universita 20","Lecce");
	Edificio e2 = es.createEdificio("Secondo Edificio","Viale Magna Grecia 44","Taranto");
	Edificio e3 = es.createEdificio("Terzo Edificio","Via Roma 102", "Manduria");

	// Creazione Postazioni da salvare nel DB
	Postazione p1 = ps.createPostazione("Scrivania",Tipo.PRIVATO,1,e1);
	Postazione p2 = ps.createPostazione("Sala",Tipo.OPENSPACE,30,e2);
	Postazione p3 = ps.createPostazione("Ufficio",Tipo.SALARIUNIONI,8,e3);
	
	// Creazione Utenti da salvare nel DB
	Utente u1 = uts.createUtente("Rick","Ricca88@yahoo.it","Riccardo Cipriani");
	Utente u2 = uts.createUtente("Felix","Felice79@gmail.com","Felice Bassi");
	Utente u3 = uts.createUtente("Teto","Stefano1988@libero.it","Stefano Brancato");
	
	// Creazione Prenotazioni da salvare nel DB
	Prenotazione pr1 = prse.createPrenotazione(LocalDate.of(2023,11,21),u1,p1);
	Prenotazione pr2 = prse.createPrenotazione(LocalDate.of(2023,9,29),u2,p2);
	Prenotazione pr3 = prse.createPrenotazione(LocalDate.of(2023,4,12),u3,p3);
	
	
	// Elementi test Extra per provare i metodi
	Utente u4 = uts.createUtente("Francy","Francesca@yahoo.it","Francesca Neri");
	uts.deleteUtenteById((long)4);
	
	}
}
