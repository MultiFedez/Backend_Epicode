package com.Lezione7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

;

public class ProjectMain {
	static Logger log = LoggerFactory.getLogger(ProjectMain.class);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		log.info("Inserisci un numero di elementi: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Set<String> paroleN = new HashSet<String>();
		Set<String> paroleDuplicate = new HashSet<String>();
		
		for(int i=0; i < n ; i++) {
			log.info("Inserisci una parola");
			String parola = scanner.nextLine();
			
			if (paroleN.contains(parola)) { // contains = verifica se la parola è già presente nel set parole
                paroleDuplicate.add(parola); // se la parola è presente, viene aggiunta al set paroleDuplicate
            }
            paroleN.add(parola);//dopo il controllo, la parola viene aggiunta al set parole con il metodo add(parola)
		}
		
		log.info("Parole duplicate:");
        for (String parola : paroleDuplicate) { //per ottenere ogni parola duplicata presente nel set
            log.info(parola);
        }

        log.info("Numero di parole distinte: " + paroleN.size());//parole.size() restituisce il numero di elementi presenti nel set di parole


        log.info("Elenco parole distinte:");
       for (String parola : paroleN) { //per ottenere ogni singola parola nel set di parole
           log.info(parola);
       } 
	
	}	
		
}


