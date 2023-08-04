package com.epicode.gestione_device.security.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("smartphone")
public class Smartphone extends Dispositivo{
	public Smartphone() {
		this.setStato(StatoDispositivo.DISPONIBILE);
	}
}
