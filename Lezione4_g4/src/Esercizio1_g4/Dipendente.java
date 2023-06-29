package Esercizio1_g4;
	
public class Dipendente {
	
	 private double stipendioBase = 1000;
	 private String matricola;
	 private double stipendio;
	 private double importoOrarioStraordinario;
	 private Livello livello;
	 private Dipartimento dipartimento;
	 
	public Dipendente(double stipendioBase, String matricola, double stipendio, double importoOrarioStraordinario,
			Livello livello, Dipartimento dipartimento) {
		super();
		this.stipendioBase = stipendioBase;
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}
	public Dipendente(String matricola, Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	public double getStipendioBase() {
		return stipendioBase;
	}
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLivello() {
		return livello;
	} 
	
	public void stampaDatiDipendente() {
	System.out.println(
	"matricola: " + this.matricola + " " + 
	"stipendio base: " + this.stipendioBase + " " + 
	"importo straordinario: " + this.importoOrarioStraordinario + " " + 
	"tuo stipendio: " + this.stipendio + " " + 
	"dipartimento: " + this.dipartimento + " " + 
	"livello: " + this.livello);
	}
	
	public void promuovi() {
		switch(this.livello) {
		case OPERAIO: 
			this.livello = Livello.IMPIEGATO;
			this.stipendio = this.stipendioBase * 1.2;
			System.out.println("Sei stato promosso a : " + this.livello);
			break;
		case IMPIEGATO: 
			this.livello = Livello.QUADRO;
			this.stipendio = this.stipendioBase * 1.5;
			System.out.println("Sei stato promosso a : " + this.livello);
			break;
		case QUADRO: 
			this.livello = Livello.DIRIGENTE;
			this.stipendio = this.stipendioBase * 2;
			System.out.println("Sei stato promosso a : " + this.livello);
			break;
		case DIRIGENTE: 
			System.out.println("Sei già il Capo");
			break;
		}
	}
		public static double calcolaPaga(Dipendente d) {
		return d.stipendio;
		}
		public static double calcolaPaga(Dipendente d, int n) {
		return d.stipendio + n*d.importoOrarioStraordinario;
		}
		
}
 
 