package com.epicode.gestione_p2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p2.model.Edificio2;

@Repository
public interface Edificio2DAORepo extends CrudRepository<Edificio2, Long> {
	
}


