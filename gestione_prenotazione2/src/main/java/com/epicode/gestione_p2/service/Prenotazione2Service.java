package com.epicode.gestione_p2.service;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p2.model.Postazione2;
import com.epicode.gestione_p2.model.Prenotazione2;
import com.epicode.gestione_p2.model.Utente2;
import com.epicode.gestione_p2.repository.Prenotazione2DAORepo;

@Service
public class Prenotazione2Service {

	Logger log = LoggerFactory.getLogger(Prenotazione2Service.class);

    @Autowired Prenotazione2DAORepo prenotazioneDAORepo;
    @Autowired @Qualifier("PrenotazioneBean") private ObjectProvider<Prenotazione2> prenotazione2Provider;

    public Prenotazione2 createPrenotazione(LocalDate data, Utente2 utente, Postazione2 postazione){
        Prenotazione2 pr = prenotazione2Provider.getObject();
        pr.setDataPrenotazione(data);
        pr.setUtente(utente);
        pr.setPostazione(postazione);

        System.out.println(pr);
        prenotazione2DAORepo.save(pr);
        log.info("Prenotazione" + pr.getId()+ " saved. ");
        return pr;
    }
    
    public void deletePrenotazioneById(Long id) {
       prenotazione2DAORepo.deleteById(id);
    }
    
    public List<Prenotazione2> findAllPrenotazione() {
        return (List<Prenotazione2>) prenotazione2DAORepo.findAll();
    }
}
