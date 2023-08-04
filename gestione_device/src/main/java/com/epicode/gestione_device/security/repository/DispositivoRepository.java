package com.epicode.gestione_device.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_device.security.entity.Dispositivo;



@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long>{

}
