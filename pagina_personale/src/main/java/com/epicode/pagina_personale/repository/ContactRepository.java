package com.epicode.pagina_personale.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.pagina_personale.model.Contacts;

@Repository
public interface ContactRepository extends CrudRepository<Contacts, Long> {
	
}


