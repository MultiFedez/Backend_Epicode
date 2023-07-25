package models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

import enums.Periodicita;

@Entity
@DiscriminatorValue(value = "abbonamento")
public class Abbonamento extends Viaggi {
	
	
	@Enumerated(EnumType.STRING)
	private Periodicita periodicita;
	private LocalDate dataScadenza;
    @OneToOne
	private Tessera idTessera;
	
    public Abbonamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abbonamento( boolean convalida, LocalDate dataEmissione, 
			            Venditore vendita ,Periodicita periodicita, 
			            LocalDate dataScadenza, Tessera idTessera) {
		super( convalida, dataEmissione, vendita);
		this.periodicita = periodicita;
		this.dataScadenza = dataScadenza;
		this.idTessera = idTessera;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Tessera getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(Tessera idTessera) {
		this.idTessera = idTessera;
	}

	@Override
	public String toString() {
		return "Abbonamento [periodicita=" + periodicita + ", "
				+ "dataScadenza=" + dataScadenza + ", idTessera=" + idTessera
				+ "]";
	}
    
}
