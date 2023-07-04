package com.Lezione7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Lezione7.ProjectMain;

public class ProjectMain_2 {
	static Logger log = LoggerFactory.getLogger(ProjectMain_2.class);
	
	public static void main(String[] args) {
		int n = 5;
		
		List<Integer> randomList = creaLista(n);
        log.info("Lista casuale: " + randomList);

        List<Integer> reverseList = generaListaReverse(randomList);
        log.info("Lista inversa: " + reverseList);
		
		log.info("Elementi in posizioni pari:");
        stampaListaOrdinata(randomList, true);

        log.info("Elementi in posizioni dispari:");
        stampaListaOrdinata(randomList, false);
		}

	public static List<Integer> creaLista(int n) { //accetta un parametro n che rappresenta il numero di elementi da generare nella lista casuale
        List<Integer> randomList = new ArrayList<>(); // per memorizzare gli interi casuali
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            randomList.add(random.nextInt(101)); // ad ogni iterazione, viene generato un numero casuale utilizzando il metodo nextInt(101)
        }

        return randomList;// la funzione restituisce la lista randomList che contiene n interi casuali generati
    }
	
	public static List<Integer> generaListaReverse(List<Integer> originalList) { //la funzione restituisce una nuova lista che contiene gli stessi elementi della lista originale, ma in ordine inverso
        List<Integer> reverseList = new ArrayList<>(originalList);
        // viene passata originalList come argomento al costruttore che crea una copia della lista originale 
        //in questo modo, la lista reverseList conterrà gli stessi elementi di originalList
        Collections.reverse(reverseList);
        //viene utilizzato il metodo reverse della classe Collections per invertire l'ordine degli elementi nella lista reverseList 
        //Questo metodo modifica direttamente la lista senza crearne una nuova

        return reverseList;
    }
	public static void stampaListaOrdinata(List<Integer> list, boolean Index) {
        //list rappresenta la lista di interi da stampare
        //Index => valore booleano che determina se stampare gli elementi nelle posizioni pari o dispari della lista
        for (int i = 0; i < list.size(); i++) { // La condizione i < list.size() indica che il ciclo continuerà fino a quando l'indice i è inferiore alla dimensione della lista
            if ((Index && i % 2 == 0) || (!Index && i % 2 != 0)) {
                //questa condizione controlla se Index è true e se l'indice i è pari, oppure se Index è false e se l'indice i è dispari 
                //in altre parole, controlla se l'elemento nella posizione corrente della lista deve essere stampato in base al valore di Index
                log.info(String.valueOf(list.get(i)));
                //restituisce l'elemento nella posizione i della lista
                //String.valueOf viene utilizzato per convertire l'intero in una stringa
            }
        }
    }
}

