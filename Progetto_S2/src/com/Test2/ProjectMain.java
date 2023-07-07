package com.Test2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectMain {

	private static Logger logger = LoggerFactory.getLogger(ProjectMain.class);
	public static List <CatalogoBibliotecario> catLog = new ArrayList<CatalogoBibliotecario>();
	private static File f = new File("doc/test.txt");
	
	public static void main(String[] args) {
		deleteFile();
		Riviste rivista1 = new Riviste(97912200,"La Settimana Enigmistica", 1932, 60, Periodicita.SETTIMANALE);
		Riviste rivista2 = new Riviste(87582920,"National Geographic Magazine", 1888, 89, Periodicita.MENSILE);
		Libri libro1 = new Libri(12345678,"4 Ventimila Leghe Sotto i Mari", 1869, 440,"Jules Verne","Avventura");
		Libri libro2 = new Libri(52854741,"Sapiens",2011,544,"Yuval Noah Harari","Storia");
	
	addToCatalogo(rivista1);
	addToCatalogo(rivista2);
	addToCatalogo(libro1);
	addToCatalogo(libro2);
	
	salvataggio(rivista1);
	salvataggio(rivista2);
	salvataggio(libro1);
	salvataggio(libro2);
	
	// METODI LANCIATI
	
	//mostraLista(catLog);
	//removeFromCatalogo(12345678);
	//mostraLista(catLog);
	searchForIsbn(52854741);
	searchForYear(1888);
	searchByeAuthor("Yuval Noah Harari");
	}
	
	// PUNTO 1 AGGIUNTA
	public static void addToCatalogo(CatalogoBibliotecario c) {
		catLog.add(c);
	}
	public static void mostraLista(List<CatalogoBibliotecario> l) {
		for(int i = 0; i< l.size(); i++) {
			logger.info("Elemento : " + l.get(i));
		}	
	}
	
	// PUNTO 2 RIMOZIONE
	public static List<CatalogoBibliotecario> removeFromCatalogo(int Isbn) {
		List<CatalogoBibliotecario> rem = catLog.stream()
				.filter(p -> p.getCodiceIsbn() == Isbn)
				.collect(Collectors.toList());
		rem.forEach(p -> catLog.remove(p));
		System.out.println("Elemento eliminato correttamente");
		return catLog;
		
	}
	
	// PUNTO 3 RICERCA PER ISBN
	public static void searchForIsbn(int Isbn){
		List<CatalogoBibliotecario> rem = catLog.stream()
				.filter(p -> p.getCodiceIsbn() == Isbn)
				.collect(Collectors.toList());
		rem.forEach(p -> 
			   logger.info("Codice ISBN :" + p.getCodiceIsbn()));
	}
	
	// PUNTO 4 RICERCA PER ANNO DI PUBBLICAZIONE
	public static void searchForYear(Integer annoPubblicazione){
		List<CatalogoBibliotecario> rem = catLog.stream()
				.filter(p -> p.getAnnoPubblicazione().equals(annoPubblicazione))
				.collect(Collectors.toList());
		rem.forEach(p -> 
			   logger.info("Anno Pubblicazione :" + p.getAnnoPubblicazione()));
	}	
	
	// PUNTO 5 RICERCA PER AUTORE
	public static void searchByeAuthor(String autore) {
        List<Libri> rem = catLog.stream()
                 .filter(p -> p instanceof Libri)
                 .map(p -> (Libri)p)
                 .filter(p -> p.getAutore() == autore)
                 .collect(Collectors.toList());
        rem.forEach(p -> {
        	   logger.info("Autore :" + p.getAutore());
           });  
    }
	
	// PUNTO 6 SALVATAGGIO SU DISCO DELL'ARCHIVIO
	public static void salvataggio(CatalogoBibliotecario s){
	try {
        FileUtils.writeStringToFile(f, f.toString() , "UTF-8", true);
    } catch (IOException e) {
        e.printStackTrace();
    }}
	public static void deleteFile(){
        FileUtils.deleteQuietly(f);
    }
	
	
	
	// PUNTO 7 CARICAMENTO DAL DISCO DELL'ARCHIVIO
}
