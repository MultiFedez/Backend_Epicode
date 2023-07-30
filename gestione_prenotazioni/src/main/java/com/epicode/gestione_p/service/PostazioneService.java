package com.epicode.gestione_p.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p.model.Edificio;
import com.epicode.gestione_p.model.Postazione;
import com.epicode.gestione_p.model.Tipo;
import com.epicode.gestione_p.repository.PostazioneDAORepo;



@Service
public class PostazioneService {

	Logger log = LoggerFactory.getLogger(PostazioneService.class);

    @Autowired PostazioneDAORepo postazioneDAORepo;
    @Autowired @Qualifier("PostazioneBean") private ObjectProvider<Postazione> postazioneProvider;

    public Postazione createPostazione(String descrizione,Tipo tipo, Integer numMaxOccupanti, Edificio edificio) {
        Postazione post = postazioneProvider.getObject();
        post.setDescrizione(descrizione);
        post.setTipo(tipo);
        post.setNumMaxOccupanti(numMaxOccupanti);
        post.setEdificio(edificio);
        postazioneDAORepo.save(post);
        log.info("Postazione" + post.getId() + " saved.");
        return post;
    }
    
    public void deletePostazioneById(Long id) {
        postazioneDAORepo.deleteById(id);
    }
    
    public List<Postazione> findAllPostazioni() {
        return (List<Postazione>) postazioneDAORepo.findAll();
    }
}
