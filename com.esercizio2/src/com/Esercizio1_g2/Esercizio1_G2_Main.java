package com.Esercizio1_g2;

public class Esercizio1_G2_Main {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(25,10);
		Rettangolo r2 = new Rettangolo(50,25);
		
		System.out.prinln("***** Stampa perimetro e area di ogni rettangolo *****");
		stampaRettangolo(r1);
		stampaRettangolo(r2);
		
		System.out.println

	}
public static void stampaRettangolo(Rettangolo r) {
	System.out.print("Perimetro del Rettangolo:" + r.calcolaPerimetro());
	System.out.print("Area del Rettangolo:" + r.calcolaArea());
}

public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
	
}
}
