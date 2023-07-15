package controller;

import elementiDao.EditoreDAO;
import enumeration.Periodicita;
import model.Libri;
import model.Riviste;


public class ProjectMain {

	public static EditoreDAO edao = new EditoreDAO();
	
	public static void main(String[] args) {
		
//		Libri lib1 = new Libri();
//		lib1.setTitolo("4 mila leghe sotto i mari");
//		lib1.setAnnoPubblicazione(1869);
//		lib1.setNumeroPagine(440);
//		lib1.setAutore("Jules Verne");
//		lib1.setGenere("Avventura");
//		edao.save(lib1);
		//
//		Libri lib2 = new Libri();
//		lib2.setTitolo("Sapiens");
//		lib2.setAnnoPubblicazione(2011);
//		lib2.setNumeroPagine(544);
//		lib2.setAutore("Yuval Noah Harari");
//		lib2.setGenere("Storia");
//		edao.save(lib2);
		//
//		Riviste riv1 = new Riviste();
//		riv1.setTitolo("National Geographic Magazine");
//		riv1.setAnnoPubblicazione(1888);
//		riv1.setNumeroPagine(89);
//		riv1.setPeriodicita(Periodicita.MENSILE);
//		edao.save(riv1);
		//		
//		Riviste riv2 = new Riviste();
//		riv2.setTitolo("La Settimana Enigmistica");
//		riv2.setAnnoPubblicazione(1932);
//		riv2.setNumeroPagine(60);
//		riv2.setPeriodicita(Periodicita.SETTIMANALE);
//		edao.save(riv2);
	
		Libri lib3 = new Libri();
		lib3.setTitolo("Sapiens");
		lib3.setAnnoPubblicazione(2011);
		lib3.setNumeroPagine(544);
		lib3.setAutore("Yuval Noah Harari");
		lib3.setGenere("Storia");
		//edao.save(lib3);
		//edao.delete(5);
		//edao.getById(4);
		//edao.searchForYear(1888);
		//edao.searchForAuthor("Jules Verne");
		edao.searchForTitle("National Geographic Magazine");
		
	}
}
