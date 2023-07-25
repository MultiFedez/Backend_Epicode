package models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tessere")
public class Tessera {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtessera;
	
	@Column(nullable = false)
	private LocalDate dataConvalida;
	
	@Column(nullable = false)
	private LocalDate dataScadenza;
	/* Ad esempio, supponiamo di avere due entità: "Tessera" 
	 * e "Utente". Una Tessera può avere solo un Utente. 
	 * Se avessi messo CASCADE si ha una duplicazione di 
	 * tuple su Utente. */
	@OneToOne(cascade = CascadeType.ALL)	
	private Utente utente;
	
	public Tessera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tessera(LocalDate dataConvalida, LocalDate dataScadenza, Utente utente) {
		super();
		this.dataConvalida = dataConvalida;
		this.dataScadenza = dataScadenza;
		this.utente = utente;
	}

	public Integer getIdtessera() {
		return idtessera;
	}

	public void setIdtessera(Integer idtessera) {
		this.idtessera = idtessera;
	}

	public LocalDate getDataConvalida() {
		return dataConvalida;
	}

	public void setDataConvalida(LocalDate dataConvalida) {
		this.dataConvalida = dataConvalida;
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Tessera [idtessera=" + idtessera + ", dataConvalida=" + dataConvalida + ", dataScadenza=" + dataScadenza
				+ ", utente=" + utente + "]";
	}

}
