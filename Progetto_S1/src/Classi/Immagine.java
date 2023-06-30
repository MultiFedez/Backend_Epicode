package Classi;

import Interface.ILuminosita;

public class Immagine extends ElementoMultimediale implements ILuminosita{
	
	public int luminosita;
	
	
	
	public Immagine(String titolo, int luminosita) {
		super();
		this.titolo = titolo;
		this.luminosita = luminosita;
	}
	public int diminuisciLuminosita() {
		return luminosita -- ;
	}
	public int aumentaLuminosita() {
		return luminosita ++;
	}
	
	public void show() {
		for(int i=0; i<this.luminosita; i++) {
			System.out.print(this.titolo);
			for(int z=0; z<this.luminosita; z++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
