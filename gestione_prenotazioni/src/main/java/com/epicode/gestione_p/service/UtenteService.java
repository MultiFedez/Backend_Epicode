package com.epicode.gestione_p.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p.model.Utente;
import com.epicode.gestione_p.repository.UtenteDAORepo;

@Service
public class UtenteService {

	Logger log = LoggerFactory.getLogger(UtenteService.class);

    @Autowired UtenteDAORepo utenteDAORepo;
    @Autowired @Qualifier("UtenteBean") private ObjectProvider<Utente> utenteProvider;

    public Utente createUtente(String username,String email, String name) {
        Utente utente = utenteProvider.getObject();
        utente.setUsername(username);
        utente.setEmail(email);
        utente.setName(name);
        
        utenteDAORepo.save(utente);
        log.info("Utente" + utente.getName() + " saved.");
        return utente;
    }
    
    public void deleteUtenteById(Long id) {
        utenteDAORepo.deleteById(id);
    }
    
    public List<Utente> findAllUtenti() {
        return (List<Utente>) utenteDAORepo.findAll();
    }
}
