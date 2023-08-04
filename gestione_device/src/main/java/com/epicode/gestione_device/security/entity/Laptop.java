package com.epicode.gestione_device.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("laptop")
public class Laptop extends Dispositivo {
	public Laptop() {
		this.setStato(StatoDispositivo.DISPONIBILE);
	}

}
