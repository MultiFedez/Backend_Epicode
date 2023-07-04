package com.Lezione6;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectMain {
	static Logger log = LoggerFactory.getLogger(ProjectMain.class);
	
public static void main(String[] args) {
	
	int[]numArray = generateArray();
	stampaArray(numArray);
	cambiaValoreArray(numArray);
	log.info("FINE");
		
	}


public static int[]  generateArray() {
    int[] array = new int[5];
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
       array[i] = rand.nextInt(11);
    }
    return array;
}

public static void stampaArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        log.info("Posizione : " + i + "Valore:" + array[i]);
    }
}
public static void cambiaValoreArray(int[] array) {
    Scanner sc = new Scanner(System.in);
    while(true) {
        System.out.print("Inserisci un nuovo valore da 1 a 10 oppure 0 per uscire: ");
        try {
            int val = Integer.parseInt(sc.nextLine());
            if(val == 0) {
                return;
            } else if(val > 10) {
                throw new ExceptionClass("Devi inserire un valore da 1 a 10!!!!");
            }
            System.out.print("Inserisci una posizione da 0 a 4): ");
            int pos = Integer.parseInt(sc.nextLine());
            array[pos] = val;

        } catch (ArrayIndexOutOfBoundsException e) {
            log.error(e.getMessage());
        } catch (NumberFormatException e) {
            log.error(e.getMessage());
        } catch (ExceptionClass e) {
            log.error(e.getMessage());
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        stampaArray(array);
    }
}

}