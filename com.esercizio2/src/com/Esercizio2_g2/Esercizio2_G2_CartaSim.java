package com.Esercizio2_g2;

public class Esercizio2_G2_CartaSim {

	 String numeroTelefono;
	 double credito;
	 Chiamata[] listaChiamate;
	 
	 public Esercizio2_G2_CartaSim(String numeroTelefono) {
		 this.numeroTelefono = numeroTelefono;
		 this.credito = 0;
		 this.listaChiamate = new Chiamata[5];
		 
	 }
	 
	 public void stampaDatiSim() {
		 System.out.println("**** Dati SIM ****");
		 System.out.println("Numero SIM:" + this.numeroTelefono);
		 System.out.println("Credito:" + this.credito);
		 for(int i = 0; i < listaChiamata.length; i++) {
			 if(listaChiamate[i])
		 }
			
	 }
}
