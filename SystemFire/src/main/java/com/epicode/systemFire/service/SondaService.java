package com.epicode.systemFire.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.epicode.systemFire.model.Sonda;
import com.epicode.systemFire.repository.SondaRepository;

@Service
public class SondaService {
	Logger log = LoggerFactory.getLogger(SondaService.class);
	@Autowired SondaRepository repoEd;
	@Autowired @Qualifier("sondaBean") private ObjectProvider<Sonda> sondaProvider;
	
	
	public Sonda creaSonda( int latitudine, int longitudine, int livelloPericolo){
        Sonda s = sondaProvider.getObject();
        s.setLatitudine(latitudine);
        s.setLongitudine(longitudine);
        s.setLivelloPericolo(livelloPericolo);
        repoEd.save(s);
        log.info( s.toString()+ "  save Database. ");
        return s;
    }
}
