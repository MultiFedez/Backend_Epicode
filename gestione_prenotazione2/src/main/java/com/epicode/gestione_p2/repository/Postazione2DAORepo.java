package com.epicode.gestione_p2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p2.model.Postazione2;

@Repository
public interface Postazione2DAORepo extends CrudRepository<Postazione2, Long> {
	
}
