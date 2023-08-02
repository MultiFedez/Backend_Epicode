package com.epicode.gestione_p2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p2.model.Utente2;

@Repository
public interface Utente2DAORepo  extends CrudRepository<Utente2, Long> {

}
