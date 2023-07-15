package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libri")
public class Libri extends CatalogoBibliotecario {

	private String Autore;
	private String Genere;
	
	public Libri() {
		super();
	}

	public String getAutore() {
		return Autore;
	}
	public void setAutore(String autore) {
		Autore = autore;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}

	@Override
	public String toString() {
		return "Libri ["+ super.toString() + "Autore=" + Autore + ", Genere=" + Genere + "]";
	}
	
	
	
	
}

