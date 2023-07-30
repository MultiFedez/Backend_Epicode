package com.epicode.gestione_p.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p.model.Postazione;

@Repository
public interface PostazioneDAORepo extends CrudRepository<Postazione, Long> {
	
 	
	
}
