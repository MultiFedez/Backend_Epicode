package com.Lezione8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementoThread extends Thread {

	private Logger log = LoggerFactory.getLogger(ElementoThread.class);
	private String simbolo;
	
	public ElementoThread(String simbolo) {
		this.simbolo = simbolo;
	}
	
	@Override
	public void run() {
		// Nel metodo Run della maia classe Thread vado ad inserire la logica
		// che il thread deve eseguire
		for(int i=0; i<=10; i++) {
			System.out.println(simbolo);
			try {
					Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
		}
	}
}
