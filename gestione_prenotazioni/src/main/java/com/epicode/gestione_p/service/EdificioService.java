package com.epicode.gestione_p.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.gestione_p.model.Edificio;
import com.epicode.gestione_p.repository.EdificioDAORepo;



@Service
public class EdificioService {

	Logger log = LoggerFactory.getLogger(EdificioService.class);

    @Autowired EdificioDAORepo edificioDAORepo;
    @Autowired @Qualifier("EdificioBean") private ObjectProvider<Edificio> edificioProvider;
	
	public Edificio createEdificio(String nome, String indirizzo, String citta){
        Edificio ed = edificioProvider.getObject();
        ed.setNome(nome);
        ed.setIndirizzo(indirizzo);
        ed.setCitta(citta);

        System.out.println(ed);
        edificioDAORepo.save(ed);
        log.info("Edificio" + ed.getNome()+ " saved. ");
        return ed;
    }
	
	public void deleteEdificioById(Long id) {
        edificioDAORepo.deleteById(id);
    }
    
    public List<Edificio> findAllEdifici() {
        return (List<Edificio>) edificioDAORepo.findAll();
    }
}
