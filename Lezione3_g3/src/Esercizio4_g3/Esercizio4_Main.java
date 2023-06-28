package Esercizio4_g3;

import java.util.Scanner;

public class Esercizio4_Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		contoAllaRovescia();
	}
	
	public static void contoAllaRovescia() {
		
		System.out.println("conto alla rovescia:");
		int partenza = Integer.parseInt(sc.nextLine());
		for(int i = partenza; i >= 0; i--) {
			System.out.println(i);
		}
	}
}

