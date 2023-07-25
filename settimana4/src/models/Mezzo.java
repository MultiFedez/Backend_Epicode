package models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import enums.ParcoMezzo;
import enums.TipoMezzo;

@Entity
@Table(name = "mezzi")
public class Mezzo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idmezzo;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoMezzo tipoMezzo;
	
	@Column(nullable = false)
	private Integer capienza;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ParcoMezzo stato;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Tratta tratta;
	
	@OneToMany
	List<TempoTratta> tempoeffettivo;
	
	public Mezzo() {
		super();
	}

	public Mezzo(TipoMezzo tipoMezzo, Integer capienza, ParcoMezzo stato, Tratta tratta) {
		super();
		this.tipoMezzo = tipoMezzo;
		this.capienza = capienza;
		this.stato = stato;
		this.tratta = tratta;
	}

	public Integer getIdmezzo() {
		return idmezzo;
	}

	public void setIdmezzo(Integer idmezzo) {
		this.idmezzo = idmezzo;
	}

	public TipoMezzo getTipoMezzo() {
		return tipoMezzo;
	}

	public void setTipoMezzo(TipoMezzo tipoMezzo) {
		this.tipoMezzo = tipoMezzo;
	}

	public Integer getCapienza() {
		return capienza;
	}

	public void setCapienza(Integer capienza) {
		this.capienza = capienza;
	}

	public ParcoMezzo getStato() {
		return stato;
	}

	public void setStato(ParcoMezzo stato) {
		this.stato = stato;
	}

	public Tratta getTratta() {
		return tratta;
	}

	public void setTratta(Tratta tratta) {
		this.tratta = tratta;
	}
	
	public void addTempoEffettivo(TempoTratta lt) {
        this.tempoeffettivo.add(lt);
    }

	@Override
	public String toString() {
		return "Mezzo [idmezzo=" + idmezzo + ", tipoMezzo=" + tipoMezzo + ", capienza=" + capienza + ", stato=" + stato
				+ ", tratta=" + tratta + ", tempoeffettivo=" + tempoeffettivo + "]";
	}

	
}
	
	
	
	


