package com.ProgettoS1;

import java.util.Scanner;

import Classi.ElementoMultimediale;
import Classi.Immagine;
import Classi.RegistrazioneAudio;
import Classi.Video;

public class Project_S1_Main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// titolo - durata - volume AUDIO/VIDEO
		// titolo - luminosità IMMAGINE
		// nei Print in ordine TITOLO spazio VOLUME/LUMINOSITA
		// AUDIO
		System.out.println("Inserisci titolo Audio : ");
		String title = scanner.next();
		System.out.println("Inserisci durata Audio : ");
		int durata = scanner.nextInt();
		System.out.println("Inserisci Volume Audio : ");
		int volume = scanner.nextInt();
		RegistrazioneAudio reg = new RegistrazioneAudio (title, durata, volume);
		reg.alzaVolume();
		System.out.println(reg.titolo + " " + reg.volume);
		reg.abbassaVolume();
		System.out.println(reg.titolo + " " + reg.volume);
		reg.play();
		
		// IMMAGINE
		System.out.println("Inserisci titolo Immagine : ");
		String titleImg = scanner.next();
		System.out.println("Inserisci Luminosità : ");
		int luminosita = scanner.nextInt();
		Immagine img = new Immagine(titleImg, luminosita);
		img.diminuisciLuminosita();
		System.out.println(img.titolo + " " + img.luminosita);
		img.aumentaLuminosita();
		System.out.println(img.titolo + " " + img.luminosita);
		img.show();
		
		// VIDEO
		System.out.println("Inserisci titolo Video : ");
		String titleVid = scanner.next();
		System.out.println("Inserisci durata Video : ");
		int durataVid = scanner.nextInt();
		System.out.println("Inserisci Volume Video : ");
		int volumeVid = scanner.nextInt();
		System.out.println("Regola luminosità : ");
		int luminositaVid = scanner.nextInt();
		Video vid = new Video(titleVid,durataVid,volumeVid,luminositaVid);
		vid.alzaVolume();
		System.out.println(vid.titolo + " " + vid.volume);
		vid.abbassaVolume();
		System.out.println(vid.titolo + " " + vid.volume);
		vid.play();
		
		//non sono sicuro che serva ripetere tutto così
		vid.diminuisciLuminosita();
		System.out.println(vid.titolo + " " + vid.luminosita);
		vid.aumentaLuminosita();
		System.out.println(vid.titolo + " " + vid.luminosita);
		vid.show();
		
		// ARRAY ma con parametri passati da me 
		ElementoMultimediale[] MultiArray = {vid,img,reg};
	}
	
	
}