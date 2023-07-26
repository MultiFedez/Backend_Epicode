package com.epicode.ex_1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Tavolo {
	private Integer numero;
	private Integer numeroMassimoCoperti;
	private Boolean occupato = false;
	
	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}

}
