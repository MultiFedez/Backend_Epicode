package com.epicode.gestione_p2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p2.model.Utente2;
import com.epicode.gestione_p2.repository.Utente2DAORepo;



@Service
public class Utente2Service {

	Logger log = LoggerFactory.getLogger(Utente2Service.class);

    @Autowired Utente2DAORepo utenteDAORepo;
    @Autowired @Qualifier("UtenteBean") private ObjectProvider<Utente2> utente2Provider;

    public Utente2 createUtente2(String username,String email, String name) {
        Utente2 utente = utente2Provider.getObject();
        utente.setUsername(username);
        utente.setEmail(email);
        utente.setName(name);
        
        utente2DAORepo.save(utente);
        log.info("Utente" + utente.getName() + " saved.");
        return utente;
    }
    
    public void deleteUtenteById(Long id) {
        utente2DAORepo.deleteById(id);
    }
    
    public List<Utente2> findAllUtenti() {
        return (List<Utente2>) utente2DAORepo.findAll();
    }
}
