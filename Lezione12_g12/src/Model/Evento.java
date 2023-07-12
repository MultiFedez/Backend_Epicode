package Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "titolo", nullable = false)
	private String titolo;
	
	@Column(name = "dataEvento", nullable = false)
	private LocalDate dataEvento;
	
	@Column(name = "descrizione", nullable = false)
	private String descrizione;
	
	@Column(name = "tipoEvento", nullable = false)
	private tipoEvento tipoEvento;
	
	@Column(name = "numeroMassimoPartecipanti", nullable = false)
	private Integer numeroMassimoPartecipanti;

	public Evento() {
		super();
		
	}

	public Evento(String titolo, LocalDate dataEvento, String descrizione, Model.tipoEvento tipoEvento,
			Integer numeroMassimoPartecipanti) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Evento(Long id, String titolo, LocalDate dataEvento, String descrizione, Model.tipoEvento tipoEvento,
			Integer numeroMassimoPartecipanti) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public tipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(tipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}
	
	
}




