package Esercizio3_g3;

import java.util.Scanner;

public class Esercizio3_Main {
	
	public static void main(String[] args) {

	
	while (true) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Inserisci una stringa: ");
        String testo = sc.nextLine();

        if(testo.equals(":q")) {
            break;
        }

        String[] testoSplittato = testo.split("");

        for (int i = 0; i < testoSplittato.length; i++) {
            System.out.println(testoSplittato[i] + ",");
      }
	}
  }
}
