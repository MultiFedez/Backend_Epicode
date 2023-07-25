package models;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="viaggi")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_titolo")
@NamedQuery(name = "FindForRivenditore", query = "SELECT v FROM Viaggi v WHERE v.vendita.idvendita = :idRivenditore ")
public abstract class Viaggi {
     
	@Id
	@GeneratedValue
	private Integer idviaggi;
	private boolean convalida;
	private LocalDate dataEmissione;
	//Risolvo il problema di inserimento di Abbonamento togliendo 
	//il cascade
	@ManyToOne 
	private Venditore vendita;
	
	public Viaggi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Viaggi(boolean convalida, LocalDate dataEmissione, Venditore vendita) {
		super();
		this.convalida = convalida;
		this.dataEmissione = dataEmissione;
		this.vendita = vendita;
	}

	public Integer getIdviaggi() {
		return idviaggi;
	}

	public void setIdviaggi(Integer idviaggi) {
		this.idviaggi = idviaggi;
	}

	public boolean isConvalida() {
		return convalida;
	}

	public void setConvalida(boolean convalida) {
		this.convalida = convalida;
	}

	public LocalDate getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(LocalDate dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public Venditore getVendita() {
		return vendita;
	}

	public void setVendita(Venditore vendita) {
		this.vendita = vendita;
	}

	@Override
	public String toString() {
		return "Viaggi [idviaggi=" + idviaggi + ", convalida=" + convalida + ", dataEmissione=" + dataEmissione
				+ ", vendita=" + vendita + "]";
	}

}
