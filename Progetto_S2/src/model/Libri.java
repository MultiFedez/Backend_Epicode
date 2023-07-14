package model;

public class Libri extends CatalogoBibliotecario{

	protected String Autore;
	protected String Genere;
	
	public Libri(int codiceIsbn, String titolo, Integer annoPubblicazione, Integer numeroPagine, String autore,
			String genere) {
		super(codiceIsbn, titolo, annoPubblicazione, numeroPagine);
		Autore = autore;
		Genere = genere;
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
		return "Libri [Autore=" + Autore + ", Genere=" + Genere + ", CodiceIsbn=" + CodiceIsbn + ", Titolo=" + Titolo
				+ ", AnnoPubblicazione=" + AnnoPubblicazione + ", NumeroPagine=" + NumeroPagine + "]";
	}
	
	
}
