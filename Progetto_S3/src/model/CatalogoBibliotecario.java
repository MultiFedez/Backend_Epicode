package model;

import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;

@Entity
@Table(name="CatalogoBibliotecario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TipoContenuto", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "searchForYear", query = "SELECT e FROM CatalogoBibliotecario e WHERE e.annoPubblicazione = :year")
@NamedQuery(name = "searchForAuthor", query = "SELECT e FROM CatalogoBibliotecario e WHERE e.Autore LIKE :author")
@NamedQuery(name = "searchForTitle", query = "SELECT e FROM CatalogoBibliotecario e WHERE e.titolo LIKE :title")
public class CatalogoBibliotecario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codiceIsbn;
	private String titolo;
	private int annoPubblicazione;
	private int numeroPagine;
	
	public CatalogoBibliotecario() {
		super();
	}

	public CatalogoBibliotecario(String titolo, int annoPubblicazione, int numeroPagine) {
		super();
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.numeroPagine = numeroPagine;
	}

	public Long getCodiceIsbn() {
		return codiceIsbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "CatalogoBibliotecario [codiceIsbn=" + codiceIsbn + ", titolo=" + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	

}
