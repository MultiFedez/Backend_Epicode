package app;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import dao.AbbonamentoDao;
import dao.BigliettoDao;
import dao.DistributoreDao;
import dao.MezzoDao;
import dao.TesseraDao;
import dao.TrattaDao;
import dao.UtenteDao;
import dao.VenditaDao;
import enums.ParcoMezzo;
import enums.Periodicita;
import enums.Stato;
import enums.TipoMezzo;
import models.Abbonamento;
import models.Biglietto;
import models.Distributore;
import models.Mezzo;
import models.Tessera;
import models.Tratta;
import models.Utente;
import models.Venditore;
import models.Viaggi;

public class ProjectMain {
	
	
	public static void main(String[] args) {
		
		UtenteDao ud = new UtenteDao();
		TesseraDao td = new TesseraDao();
		TrattaDao ttd = new TrattaDao();
		MezzoDao mzd = new MezzoDao();
		VenditaDao vtd = new VenditaDao();
		DistributoreDao dsd = new DistributoreDao();
		BigliettoDao bgd = new BigliettoDao();
		AbbonamentoDao abd = new AbbonamentoDao();
		
		//Crea Utente
		Utente utente1 = new Utente("Andrea", "Bardi");
		Utente utente2 = new Utente("Federico", "Morgante");
		Utente utente3 = new Utente("Riccardo", "Scibetta");
		Utente utente4 = new Utente("Marco", "Tirri");
		Utente utente5 = new Utente("Alessandro", "Aquilino");
		Utente utente6 = new Utente("Luca","Costanza");
//    	ud.save(utente1);
//    	ud.save(utente2);
//    	ud.save(utente3);
//    	ud.save(utente4);
//    	ud.save(utente5);
//    	ud.save(utente6);
		//Dato che ce il Cascade non lancio il save sull'Utente perchè altrimenti mi carica 2 volte la tabella Utente.
		
		//Crea Tessera
		Tessera tessera1 = new Tessera(LocalDate.of(2023, 7, 18),LocalDate.of(2024, 7, 17), utente1);
		Tessera tessera2 = new Tessera(LocalDate.of(2023, 1, 19),LocalDate.of(2024, 1, 18), utente2);
		Tessera tessera3 = new Tessera(LocalDate.of(2023, 3, 18),LocalDate.of(2024, 3, 17), utente3);
		Tessera tessera4 = new Tessera(LocalDate.of(2023, 4, 19),LocalDate.of(2024, 4, 18), utente4);
		Tessera tessera5 = new Tessera(LocalDate.of(2023, 2, 18),LocalDate.of(2024, 2, 17), utente5);
		Tessera tessera6 = new Tessera(LocalDate.of(2023, 7, 1),LocalDate.of(2024, 7, 31), utente6);
//		td.save(tessera1);
//		td.save(tessera2);
//		td.save(tessera3);
//		td.save(tessera4);
//		td.save(tessera5);
//		td.save(tessera6);
		
		//Crea Tratta
		Tratta tratta1 = new Tratta( "Bicocca", "Corso Como", LocalTime.of(1 ,10,12));
	    Tratta tratta2 = new Tratta( "Duomo", "Missori", LocalTime.of( 0,15,12));
		Tratta tratta3 = new Tratta( "Garibaldi", "Cadorna", LocalTime.of( 0,35,30));
        Tratta tratta4 = new Tratta( "San Siro", "Castello", LocalTime.of( 0,25,20));
        Tratta tratta5 = new Tratta( "San Babila", "Linate", LocalTime.of( 0,15,50));
        Tratta tratta6 = new Tratta( "Navigli", "San Donato", LocalTime.of( 0,12,10));
// Siccome la classe Mezzo ha una relazione di tipo @ManyToOne(cascade = CascadeType.ALL)
// non bisogna creare la tabella Tratte perchè le crea in modo automatico la tabella Mezzo
//      ttd.save(tratta1);
//		ttd.save(tratta2);
//		ttd.save(tratta3);
//		ttd.save(tratta4);
//		
		//Crea Mezzo
		Mezzo mezzo1 = new Mezzo(TipoMezzo.AUTOBUS, 50, ParcoMezzo.SERVIZIO, tratta1);
		Mezzo mezzo2 = new Mezzo(TipoMezzo.TRAM, 150, ParcoMezzo.MANUTENZIONE, tratta4);
		Mezzo mezzo3 = new Mezzo(TipoMezzo.AUTOBUS, 50, ParcoMezzo.MANUTENZIONE, tratta2);
		Mezzo mezzo4 = new Mezzo(TipoMezzo.TRAM, 60, ParcoMezzo.SERVIZIO, tratta5);
		Mezzo mezzo5 = new Mezzo(TipoMezzo.AUTOBUS, 50, ParcoMezzo.SERVIZIO, tratta6);
		Mezzo mezzo6 = new Mezzo(TipoMezzo.TRAM, 100, ParcoMezzo.SERVIZIO, tratta3);
//		mzd.save(mezzo1);	
//		mzd.save(mezzo2);
//		mzd.save(mezzo3);
//		mzd.save(mezzo4);
//		mzd.save(mezzo5);
//		mzd.save(mezzo6);
//	
		//Crea Venditore
		Venditore pv1= new Venditore("Via Roma 155",3400);
		Venditore pv2= new Venditore("Via Licata 15",1480);
		Venditore pv3= new Venditore("Piazza del Popolo 5",230);
		Venditore pv4= new Venditore("Via Foro Italico 145",1400);
		Venditore pv5= new Venditore("Via dei Mille 20",700);
		Venditore pv6= new Venditore("Via Garibaldi",2400);
//		vtd.save(pv1);
//		vtd.save(pv2);
//		vtd.save(pv3);
//		vtd.save(pv4);
//		vtd.save(pv5);
//		vtd.save(pv6);
		
		//Crea Distributore
		Distributore db1 = new Distributore("Via Nilo 13", 1234 , Stato.ATTIVO);
		Distributore db2 = new Distributore("Via Milano 23", 1338 , Stato.DISATTIVO);
		Distributore db3 = new Distributore("Via Cammello 11", 2334 , Stato.ATTIVO);
		Distributore db4 = new Distributore("Corso Umberto 18", 3434 , Stato.DISATTIVO);
		Distributore db5 = new Distributore("Viale Gramsci 7", 434 , Stato.ATTIVO);
		Distributore db6 = new Distributore("Vico Matteo Bianchi 35", 834 , Stato.ATTIVO);
//		dsd.save(db1);
//		dsd.save(db2);
//		dsd.save(db3);
//		dsd.save(db4);
//		dsd.save(db5);
//		dsd.save(db6);
		
		//Estraggo tutti i venditori da inserire in Abbonamento
//		Venditore v1 = vtd.getVenditore(1);
//		Venditore v2 = vtd.getVenditore(2);
//		Venditore v3 = vtd.getVenditore(3);
//		Venditore v4 = vtd.getVenditore(4);
//		Venditore v5 = vtd.getVenditore(5);
//		Venditore v6 = vtd.getVenditore(6);
//		
//		Mezzo m1 = mzd.getMezzo(1);
//		//System.out.println(m1);
//		Mezzo m2 = mzd.getMezzo(2);
//		Mezzo m3 = mzd.getMezzo(3);
//		Mezzo m4 = mzd.getMezzo(4);
//		Mezzo m5 = mzd.getMezzo(5);
//		Mezzo m6 = mzd.getMezzo(6);
		
		//Crea Biglietto 
//		Biglietto ticket1 = new Biglietto( true, LocalDate.of(2023, 7, 10), v1 ,LocalDate.of(2023, 7, 15) , m1);
//		Biglietto ticket2 = new Biglietto( false, LocalDate.of(2023, 3, 10), v4 ,LocalDate.of(2023, 3, 15) , m3);
//		Biglietto ticket3 = new Biglietto( true, LocalDate.of(2023, 2, 10), v3 ,LocalDate.of(2023, 4, 11) , m2);
//		Biglietto ticket4 = new Biglietto( false, LocalDate.of(2023, 6, 10), v2 ,LocalDate.of(2023, 7, 1) , m4);
//		Biglietto ticket5 = new Biglietto( true, LocalDate.of(2023, 6, 10), v5 ,LocalDate.of(2023, 7, 1) , m5);
//		Biglietto ticket6 = new Biglietto( false, LocalDate.of(2023, 6, 10), v6 ,LocalDate.of(2023, 7, 1) , m6);
//		bgd.save(ticket1);
//		bgd.save(ticket2);
//		bgd.save(ticket3);
//		bgd.save(ticket4);
//		bgd.save(ticket5);
//		bgd.save(ticket6);
	
		//Estraggo tutti i venditori da inserire in Abbonamento
//		Venditore v1 = vtd.getVenditore(1);
//		Venditore v2 = vtd.getVenditore(2);
//		Venditore v3 = vtd.getVenditore(3);
//		Venditore v4 = vtd.getVenditore(4);
//		Venditore v5 = vtd.getVenditore(5);
//		Venditore v6 = vtd.getVenditore(6);
//		//Estraggo tutte le tessere da inserire in Abbonamento
//		Tessera t6 = td.getTessera(6);
//		Tessera t2 = td.getTessera(2);
//		Tessera t5 = td.getTessera(5);
//		Tessera t4 = td.getTessera(4);
//		Tessera t1 = td.getTessera(1);
//		Tessera t3 = td.getTessera(3);
	
		//Crea Abbonamento
//		Abbonamento ab1 = new Abbonamento( false ,LocalDate.of(2023, 5, 16), v4 ,Periodicita.MENSILE,LocalDate.of(2023, 6,15), t6);
//		Abbonamento ab2 = new Abbonamento( false ,LocalDate.of(2023, 4, 16), v1 ,Periodicita.SETTIMANALE,LocalDate.of(2023, 4,23), t2);
//		Abbonamento ab3 = new Abbonamento( true ,LocalDate.of(2023, 7, 19), v3 ,Periodicita.SETTIMANALE,LocalDate.of(2023, 8,26), t5);
//    	Abbonamento ab4 = new Abbonamento( true ,LocalDate.of(2022, 6, 19), v2 ,Periodicita.MENSILE,LocalDate.of(2022, 7,18), t4);
//    	Abbonamento ab5 = new Abbonamento( false ,LocalDate.of(2022, 9, 18), v5 ,Periodicita.SETTIMANALE,LocalDate.of(2022, 9,24), t1);
//    	Abbonamento ab6 = new Abbonamento( true ,LocalDate.of(2022, 10, 5), v6 ,Periodicita.MENSILE,LocalDate.of(2022, 11,4), t3);
//		abd.save(ab2);
//		abd.save(ab1);
//		abd.save(ab3);
//		abd.save(ab4);
//		abd.save(ab5);
//		abd.save(ab6);
		
		
		 //Stampa la Lista degli Utenti PRIMO METODO
//        List<Utente> listaUtente = ud.findAll();
//        listaUtente.forEach(a -> System.out.println(a));
        
		//Ricerca Vendite maggiori di 2000 SECONDO METODO
//        List<Venditore> listaMax = vtd.findVenditeMax();
//        listaMax.forEach(a -> System.out.println(a));
        
		//Ricerca Viaggi per ID nelle classi abbonamento e biglietto TERZO METODO
//   	List<Viaggi> listaAb = abd.getActiveByCode(3);
//    	listaAb.forEach( a -> System.out.println(a));
		
		//Ricerca tutti i Distributori per Stato QUARTO METODO
//       List<Distributore> listaDist = dsd.distributoriStato(Stato.DISATTIVO);
//        listaDist.forEach( a -> System.out.println(a));
		
	}//End main
}//End ProjectMain 
