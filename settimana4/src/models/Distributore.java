package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.NamedQuery;

import enums.Stato;

@Entity
@DiscriminatorValue("distributore_automatico")
@NamedQuery(name = "Distributore.distributoriStato" , query = "SELECT d FROM Distributore d WHERE d.stato = :stato")
public class Distributore extends Venditore{
	
	@Enumerated(EnumType.STRING)
	private Stato stato;

	public Distributore() {
		super();
	}
     
	public Distributore(String indirizzo, Integer numerovendite , Stato stato) {
		super(indirizzo, numerovendite);
		this.stato = stato;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	@Override
	public String toString() {
		return "Distributore " + super.toString() + " [stato=" + stato + "]";
	}
	
}
