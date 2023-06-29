package Esercizio1_g4;

public class Gestione_Dipendenti {

	public static void main(String[] args) {
		Dipendente Federico = new Dipendente("001", Dipartimento.AMMINISTRAZIONE);
	System.out.println(Federico.getMatricola());
	Federico.stampaDatiDipendente();
	Federico.promuovi();
	System.out.println(Dipendente.calcolaPaga(Federico, 10));
	
	Dipendente Andrea = new Dipendente("002", Dipartimento.VENDITE);
	Dipendente Gianlucone = new Dipendente("003", Dipartimento.PRODUZIONE);
	Dipendente Francesca = new Dipendente("004", Dipartimento.PRODUZIONE);
	
	Andrea.promuovi();
	Andrea.promuovi();
	
	Andrea.stampaDatiDipendente();
	Gianlucone.stampaDatiDipendente();
	Francesca.stampaDatiDipendente();
	
	totalePaghe(Federico,Andrea,Gianlucone,Francesca);
	}
 
	public static void totalePaghe(Dipendente a,Dipendente b, Dipendente c, Dipendente d) {
		
		System.out.println(Dipendente.calcolaPaga(a, 5) +
		Dipendente.calcolaPaga(b, 5) +
		Dipendente.calcolaPaga(c, 5) +
		Dipendente.calcolaPaga(d, 5));
	}
}
