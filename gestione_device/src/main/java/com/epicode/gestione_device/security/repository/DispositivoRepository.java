package com.epicode.gestione_device.security.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione_device.security.entity.Dispositivo;
import com.epicode.gestione_device.security.entity.StatoDispositivo;
import com.epicode.gestione_device.security.entity.User;



@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long>{
public List<Dispositivo> findByUser(User user);
public List<Dispositivo> findByStato(StatoDispositivo stato);
public List<Dispositivo> findByUserAndStato(User user,StatoDispositivo stato);
}
