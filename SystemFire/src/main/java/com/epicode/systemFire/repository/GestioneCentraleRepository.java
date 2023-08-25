package com.epicode.systemFire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.systemFire.model.GestioneCentrale;

@Repository
public interface GestioneCentraleRepository extends JpaRepository<GestioneCentrale, Long> {

}
