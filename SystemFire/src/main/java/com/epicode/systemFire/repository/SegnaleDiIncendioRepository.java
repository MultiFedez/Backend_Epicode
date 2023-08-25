package com.epicode.systemFire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.systemFire.model.SegnaleDiIncendio;

@Repository
public interface SegnaleDiIncendioRepository extends JpaRepository<SegnaleDiIncendio, Long> {

}
