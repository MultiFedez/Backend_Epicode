package models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value = "biglietto")
public class Biglietto extends Viaggi{
	
	private LocalDate dataVidimazione;
	@ManyToOne // Abbiamo tolto il cascade per non avere ripetizioni
	private Mezzo mezzo;
	
	public Biglietto() {
		super();
		
	}
	public Biglietto( boolean convalida, LocalDate dataEmissione, Venditore vendita ,
			    LocalDate dataVidimazione , Mezzo mezzo ) {
		super(convalida, dataEmissione, vendita);
		// TODO Auto-generated constructor stub
		this.dataVidimazione = dataVidimazione;
		this.mezzo = mezzo;
	}
	public LocalDate getDataVidimazione() {
		return dataVidimazione;
	}
	public void setDataVidimazione(LocalDate dataVidimazione) {
		this.dataVidimazione = dataVidimazione;
	}
	public Mezzo getMezzo() {
		return mezzo;
	}
	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}
	@Override
	public String toString() {
		return "Biglietto [dataVidimazione=" + dataVidimazione + ", mezzo=" + mezzo + "]";
	}
	
	

    
}
