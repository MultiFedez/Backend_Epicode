package com.epicode.gestione_device.security.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "dispositivi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dispositivo", discriminatorType = DiscriminatorType.STRING)
public abstract class Dispositivo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
	@Enumerated(EnumType.STRING)
	StatoDispositivo stato;
	@ManyToOne
	User user;
}
