package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import enumeration.Periodicita;

@Entity
@DiscriminatorValue("Riviste")

public class Riviste extends CatalogoBibliotecario{

	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;

	public Riviste() {
		super();
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Riviste ["+ super.toString() +" periodicita=" + periodicita + "]";
	}
	
	
}
