package Classi;

import Interface.IVolume;

public class RegistrazioneAudio extends ElementoMultimediale implements IVolume{

	public int volume;
	public int durata;
	
public RegistrazioneAudio(String titolo, int durata, int volume) {
	this.titolo = titolo;
	this.durata = durata;
	this.volume = volume;
		
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
	public void play() {
		for(int i = 0; i < this.durata; i++) {
			System.out.print(this.titolo);
			for(int z = 0; z < this.volume; z++) {
				System.out.print("!");
			}
			System.out.println();
		}
	}
}
