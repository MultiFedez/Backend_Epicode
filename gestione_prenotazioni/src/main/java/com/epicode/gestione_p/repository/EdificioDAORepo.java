package com.epicode.gestione_p.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p.model.Edificio;

@Repository
public interface EdificioDAORepo extends CrudRepository<Edificio, Long> {
	
}


