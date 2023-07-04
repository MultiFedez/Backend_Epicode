package com.Lezione7_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProjectMain_3 {

	private static Map<String, String> rubrica = new HashMap<String, String>();
	
	public static void main(String[] args) {
		
		try {
			aggiungiContatto("Mario Rossi", "123456789");
			aggiungiContatto("Luigi Verdi", "987654321");
			aggiungiContatto("Francesca Neri", "456321789");
			//aggiungiContatto("Mario Rossi", "123456789"); // Errore Chiave Duplicata
			
			stampaContatti();
			
			String nomeContatto = ricercaContattoDaNumero("456321789");
			System.out.println("Nome contatto: " + nomeContatto);
			
			String numeroContatto = ricercaContattoDaNome("Mario Rossi");
			System.out.println("Numero contatto: " + numeroContatto);
		
			rimuoviContatto("Luigi Verdi");
			// rimuoviContatto("Antonio Bianchi"); // Errore Chiave non presente in rubrica
		
			stampaContatti();
			
			System.out.println(rubrica.toString());
		
		} catch (ContainsKeyExceptions e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	/* il blocco di codice try-catch cattura e gestisce le eccezioni di tipo 
	 * ContainsKeyExceptions e di tipo generico Exception
	     
	per l'eccezione di tipo ContainsKeyExceptions, viene stampato il messaggio 
	di errore associato all'eccezione (si trova nell'aggiunta e 
	nella rimozione del contatto) 
	per tutte le altre eccezioni di tipo Exception, viene stampato lo stack trace
	 completo => 
	indica che il blocco di codice verrà eseguito per qualsiasi altra eccezione
	 di tipo generico Exception*/
		
	}
	
	//1. L’inserimento di una coppia <Nome, telefono>
		public static void aggiungiContatto(String nome, String telefono) throws Exception {
			if(rubrica.containsKey(nome)) {
				throw new ContainsKeyExceptions("Chiave già presente nella rubrica!!!");
			} else {
				rubrica.put(nome, telefono);
				System.out.println("Contatto aggiunto in rubrica!");
			}
		}
		
	// 2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
		public static void rimuoviContatto(String nome) throws Exception {
			if(rubrica.containsKey(nome)) {
				rubrica.remove(nome);
				System.out.println("Contatto rimosso dalla rubrica!");
			} else {
				throw new ContainsKeyExceptions("Chiave NON presente nella rubrica!!!");
			}
		}
		
	// 3. La ricerca di una Persona di cui si conosce il numero di telefono
		public static String ricercaContattoDaNumero(String numero){
			Set<String> key = rubrica.keySet();
			//significa che viene creato un insieme (Set) di tipo String chiamato key, che conterrà le chiavi della rubrica
	        //il metodo keySet() viene chiamato sull'oggetto rubrica, che presumibilmente è di tipo Map, per ottenere l'insieme di tutte le chiavi presenti nella mappa
			for (String k : key) {
				if(numero.equals(rubrica.get(k))) {
					return k;
				}
			}
			return null;
		}
	//la funzione cerca nella rubrica un contatto che abbia il numero di telefono specificato 
    //restituisce il nome del contatto corrispondente se viene trovato, altrimenti restituisce null.

		
		// 4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome 
		public static String ricercaContattoDaNome(String nome){
			return rubrica.get(nome);
		}
		
		
		// 5. La stampa di tutti i contatti con nome e numero.
		public static void stampaContatti(){
			System.out.println("******* Contatti *********");
		    Set<String> key = rubrica.keySet();
		    for (String k : key) {
				System.out.println("Nome: " + k + " Numero: " + rubrica.get(k));
			}
		}

}

