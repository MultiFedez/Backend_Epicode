package com.epicode.gestione_p2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p2.model.Postazione2;
import com.epicode.gestione_p2.model.Tipo2;
import com.epicode.gestione_p2.repository.Postazione2DAORepo;



@Service
public class Postazione2Service {

	Logger log = LoggerFactory.getLogger(Postazione2Service.class);

    @Autowired Postazione2DAORepo postazioneDAORepo;
    @Autowired @Qualifier("PostazioneBean") private ObjectProvider<Postazione2> postazioneProvider;

    public Postazione2 createPostazione2(String descrizione,Tipo2 tipo, Integer numMaxOccupanti, Edificio edificio) {
        Postazione2 post = postazione2Provider.getObject();
        post.setDescrizione(descrizione);
        post.setTipo(tipo2);
        post.setNumMaxOccupanti(numMaxOccupanti);
        post.setEdificio(edificio);
        postazione2DAORepo.save(post);
        log.info("Postazione" + post.getId() + " saved.");
        return post;
    }
    
    public void deletePostazioneById(Long id) {
        postazione2DAORepo.deleteById(id);
    }
    
    public List<Postazione2> findAllPostazioni() {
        return (List<Postazione2>) postazione2DAORepo.findAll();
    }
}
