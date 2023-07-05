package com.Lezione8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectMain {
	private static Logger log = LoggerFactory.getLogger(ProjectMain.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		ElementoThread t1 = new ElementoThread("Thread : * ");
		ElementoThread t2 = new ElementoThread("Thread : # ");
		
		t1.start();
		t2.start();
	}
	

}
