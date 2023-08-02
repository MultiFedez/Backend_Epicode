package com.epicode.gestione_p2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p2.model.Edificio2;
import com.epicode.gestione_p2.repository.Edificio2DAORepo;



@Service
public class Edificio2Service {
	Logger log = LoggerFactory.getLogger(Edificio2Service.class);

    @Autowired Edificio2DAORepo edificioDAORepo;
    @Autowired @Qualifier("EdificioBean") private ObjectProvider<Edificio2> edificioProvider;
	
	public Edificio2 createEdificio(String nome, String indirizzo, String citta){
        Edificio2 ed = edificio2Provider.getObject();
        ed.setNome(nome);
        ed.setIndirizzo(indirizzo);
        ed.setCitta(citta);

        System.out.println(ed);
        edificio2DAORepo.save(ed);
        log.info("Edificio" + ed.getNome()+ " saved. ");
        return ed;
    }
	
	public void deleteEdificioById(Long id) {
        edificio2DAORepo.deleteById(id);
    }
    
    public List<Edificio2> findAllEdifici() {
        return (List<Edificio2>) edificio2DAORepo.findAll();
    }
}
