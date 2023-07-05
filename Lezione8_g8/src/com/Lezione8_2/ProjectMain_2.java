package com.Lezione8_2;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProjectMain_2 {
	private static Logger log = LoggerFactory.getLogger(ProjectMain_2.class);
	
	public static void main(String[] args) throws InterruptedException {
		int[] array = creaArray();
		int[] array2 = new int[3];
		
		ElementoThread1 a1 = new ElementoThread1(array, 0 , 1000);
		ElementoThread1 a2 = new ElementoThread1(array, 1001 , 2000);
		ElementoThread1 a3 = new ElementoThread1(array, 2001 , 3000);
		
		a1.start();
		a1.join();
		a2.start();
		a2.join();
		a3.start();
		a3.join();
		
		array2[0] = a1.getSomma();
		array2[1] = a2.getSomma();
		array2[2] = a3.getSomma();
		
		sommaArr(array2);
	}
	public static int[] creaArray(){
		int[] array = new int[3000];
		Random random = new Random();
		for(int i = 0; i < array.length; i ++) {
			array[i] = random.nextInt(101);
		}
		return array;
	}
	
	public static int sommaArr(int[]array) {
		int somma = 0;
		for(int i = 0; i < array.length; i++) {
			somma += array[i];
		}
		log.info("La somma degli array è : " + somma);
		return somma;
	}
}
