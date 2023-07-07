package com.Test2;

public class CatalogoBibliotecario {

		protected int CodiceIsbn;
		protected String Titolo;
		protected Integer AnnoPubblicazione;
		protected Integer NumeroPagine;
		
		public CatalogoBibliotecario(int codiceIsbn, String titolo, Integer annoPubblicazione,
				Integer numeroPagine) {
			super();
			CodiceIsbn = codiceIsbn;
			Titolo = titolo;
			AnnoPubblicazione = annoPubblicazione;
			NumeroPagine = numeroPagine;
		}

		public int getCodiceIsbn() {
			return CodiceIsbn;
		}

		public void setCodiceIsbn(int codiceIsbn) {
			CodiceIsbn = codiceIsbn;
		}

		public String getTitolo() {
			return Titolo;
		}

		public void setTitolo(String titolo) {
			Titolo = titolo;
		}

		public Integer getAnnoPubblicazione() {
			return AnnoPubblicazione;
		}

		public void setAnnoPubblicazione(Integer annoPubblicazione) {
			AnnoPubblicazione = annoPubblicazione;
		}

		public Integer getNumeroPagine() {
			return NumeroPagine;
		}

		public void setNumeroPagine(Integer numeroPagine) {
			NumeroPagine = numeroPagine;
		}
		
		
}
