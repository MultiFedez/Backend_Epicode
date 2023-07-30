package com.epicode.gestione_p.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p.model.Postazione;
import com.epicode.gestione_p.model.Prenotazione;
import com.epicode.gestione_p.model.Utente;
import com.epicode.gestione_p.repository.PrenotazioneDAORepo;


@Service
public class PrenotazioneService {

	Logger log = LoggerFactory.getLogger(PrenotazioneService.class);

    @Autowired PrenotazioneDAORepo prenotazioneDAORepo;
    @Autowired @Qualifier("PrenotazioneBean") private ObjectProvider<Prenotazione> prenotazioneProvider;

    public Prenotazione createPrenotazione(LocalDate data, Utente utente, Postazione postazione){
        Prenotazione pr = prenotazioneProvider.getObject();
        pr.setDataPrenotazione(data);
        pr.setUtente(utente);
        pr.setPostazione(postazione);

        System.out.println(pr);
        prenotazioneDAORepo.save(pr);
        log.info("Prenotazione" + pr.getId()+ " saved. ");
        return pr;
    }
    
    public void deletePrenotazioneById(Long id) {
       prenotazioneDAORepo.deleteById(id);
    }
    
    public List<Prenotazione> findAllPrenotazione() {
        return (List<Prenotazione>) prenotazioneDAORepo.findAll();
    }
}
