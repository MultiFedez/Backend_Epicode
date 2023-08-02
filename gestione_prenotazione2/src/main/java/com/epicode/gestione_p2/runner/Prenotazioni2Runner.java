package com.epicode.gestione_p2.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestione_p2.model.Edificio2;
import com.epicode.gestione_p2.model.Postazione2;
import com.epicode.gestione_p2.model.Prenotazione2;
import com.epicode.gestione_p2.model.Tipo2;
import com.epicode.gestione_p2.model.Utente2;
import com.epicode.gestione_p2.service.Edificio2Service;
import com.epicode.gestione_p2.service.Postazione2Service;
import com.epicode.gestione_p2.service.Prenotazione2Service;
import com.epicode.gestione_p2.service.Utente2Service;

@Component
public class Prenotazioni2Runner implements CommandLineRunner{
	@Autowired Edificio2Service es;
	@Autowired Postazione2Service ps;
	@Autowired Prenotazione2Service prse;
	@Autowired Utente2Service uts;
	
	@Override
	public void run(String... args) throws Exception {
		  System.out.println("Runner");
		
	// Creazione Edifici da salvare nel DB
	Edificio2 e1 = es.createEdificio("Primo Edificio","Viale dell Universita 20","Lecce");
	Edificio2 e2 = es.createEdificio("Secondo Edificio","Viale Magna Grecia 44","Taranto");
	Edificio2 e3 = es.createEdificio("Terzo Edificio","Via Roma 102", "Manduria");

	// Creazione Postazioni da salvare nel DB
	Postazione2 p1 = ps.createPostazione2("Scrivania",Tipo2.PRIVATO,1,e1);
	Postazione2 p2 = ps.createPostazione2("Sala",Tipo2.OPENSPACE,30,e2);
	Postazione2 p3 = ps.createPostazione2("Ufficio",Tipo2.SALARIUNIONI,8,e3);
	
	// Creazione Utenti da salvare nel DB
	Utente2 u1 = uts.createUtente("Rick","Ricca88@yahoo.it","Riccardo Cipriani");
	Utente2 u2 = uts.createUtente("Felix","Felice79@gmail.com","Felice Bassi");
	Utente2 u3 = uts.createUtente("Teto","Stefano1988@libero.it","Stefano Brancato");
	
	// Creazione Prenotazioni da salvare nel DB
	Prenotazione2 pr1 = prse.createPrenotazione(LocalDate.of(2023,11,21),u1,p1);
	Prenotazione2 pr2 = prse.createPrenotazione(LocalDate.of(2023,9,29),u2,p2);
	Prenotazione2 pr3 = prse.createPrenotazione(LocalDate.of(2023,4,12),u3,p3);
	
	
	// Elementi test Extra per provare i metodi
	Utente2 u4 = uts.createUtente("Francy","Francesca@yahoo.it","Francesca Neri");
	uts.deleteUtenteById((long)4);
	
	}
}

