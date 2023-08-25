package com.epicode.systemFire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.systemFire.model.Sonda;

@Repository
public interface SondaRepository extends JpaRepository<Sonda, Long>{

}
