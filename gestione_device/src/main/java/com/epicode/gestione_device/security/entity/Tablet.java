package com.epicode.gestione_device.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("tablet")
public class Tablet extends Dispositivo {
	public Tablet() {
		this.setStato(StatoDispositivo.DISPONIBILE);
	}

}
