package Classi;

import Interface.ILuminosita;
import Interface.IVolume;

public class Video extends ElementoMultimediale implements IVolume, ILuminosita {
	
	public int luminosita;
	public int volume;
	public int durata;
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
		}
	@Override	
	public int abbassaVolume() {
		return volume --;
		}
	@Override
	public int alzaVolume() {
		return volume ++;
		}
	@Override
	public int diminuisciLuminosita() {
		return luminosita -- ;
	}
	@Override
	public int aumentaLuminosita() {
		return luminosita ++;
	}
	@Override
	public void play() {
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
				for(int z = 0; z < this.volume; z++) {
					System.out.print("!");
			}
		System.out.println();
		}
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
