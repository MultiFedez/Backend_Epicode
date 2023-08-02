package com.epicode.gestione_p2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_p2.model.Prenotazione2;

@Repository
public interface Prenotazione2DAORepo  extends CrudRepository<Prenotazione2, Long>{

}
