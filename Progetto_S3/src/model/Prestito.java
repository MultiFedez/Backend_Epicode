package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Prestito")
public class Prestito{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private CatalogoBibliotecario elementoPrestato;
	@ManyToOne(fetch = FetchType.LAZY)
	private Utente utente;
	@Column(name = "dataInizioPrestito")
	private LocalDate dataIniziPrestito;
	@Column(name = "dataRestituzionePrevista")
	private LocalDate dataRestituzionePrevista;
	@Column(name = "dataRestituzioneEffettiva")
	private LocalDate dataRestituzioneEffettiva;
	
	public Prestito() {
		super();
	}
	
	public Prestito(CatalogoBibliotecario elementoPrestato, Utente utente, LocalDate dataIniziPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.elementoPrestato = elementoPrestato;
		this.utente = utente;
		this.dataIniziPrestito = dataIniziPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Long getId() {
		return id;
	}

	public CatalogoBibliotecario getElementoPrestato() {
		return elementoPrestato;
	}

	public void setElementoPrestato(CatalogoBibliotecario elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public LocalDate getDataIniziPrestito() {
		return dataIniziPrestito;
	}

	public void setDataIniziPrestito(LocalDate dataIniziPrestito) {
		this.dataIniziPrestito = dataIniziPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id + ", elementoPrestato=" + elementoPrestato + ", utente=" + utente
				+ ", dataIniziPrestito=" + dataIniziPrestito + ", dataRestituzionePrevista=" + dataRestituzionePrevista
				+ ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}

	
	
	
}
