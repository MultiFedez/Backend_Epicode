package com.Lezione6;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectMain {
	static Logger log = LoggerFactory.getLogger(ProjectMain.class);
	
public static void main(String[] args) {
		
	}
	public static void conteggio() {
	int[] array = new int[5];
	Scanner scann = new Scanner(System.in);
	
	for(int i = 0; i < array.length;i ++) {
		log.info("Scegli un numero da 1 a 10");
		
		try {
		int numero = scann.nextInt();
		log.info("");   
		if(numero < 1 || numero > 10) {
		}
		
	}
}
