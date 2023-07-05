package com.Lezione8_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementoThread1 extends Thread{
	private Logger log = LoggerFactory.getLogger(ElementoThread1.class);
	
	int[] array;
	int n;
	int x;
	int somma;
	
	public ElementoThread1(int[] array, int n, int x) {
		this.array = array;
		this.n = n;
		this.x = x;
		this.somma = 0;
	}
	
	public int getSomma() {
		return somma;
	}
	@Override
	public void run() {
		for(int i = n; i < x; i++) {
			somma += array[i];
		}
		log.info("La somma degli Elementi è : " + somma);
	}
}
