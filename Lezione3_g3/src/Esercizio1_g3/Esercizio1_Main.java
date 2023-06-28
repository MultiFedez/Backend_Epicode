package Esercizio1_g3;

public class Esercizio1_Main {

	public static void main(String[] args) {
		
		System.out.println(stringaPariDispari("Federico"));
		System.out.println(stringaPariDispari("Mery"));
		
		System.out.println(annoBisestile(2023));
		System.out.println(annoBisestile(2400));
	}
// PARI e DISPARI
	public static boolean stringaPariDispari(String p) {
		if(p.length()%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
// ANNO BISESTILE
	public static boolean annoBisestile(int anno) {
		if(anno%4 == 0) {
			return true;
		}else if(anno%100 == 0 && anno%400 == 0){
			return true;
		}else{
			return false;	
		}
	}
}
