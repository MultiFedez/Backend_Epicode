package model;

public class Riviste extends CatalogoBibliotecario{
	
	private Periodicita Periodicita;

	public Riviste(int codiceIsbn, String titolo, Integer annoPubblicazione, Integer numeroPagine,
			model.Periodicita periodicita) {
		super(codiceIsbn, titolo, annoPubblicazione, numeroPagine);
		Periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return Periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		Periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Riviste [Periodicita=" + Periodicita + ", CodiceIsbn=" + CodiceIsbn + ", Titolo=" + Titolo
				+ ", AnnoPubblicazione=" + AnnoPubblicazione + ", NumeroPagine=" + NumeroPagine + "]";
	}

}
