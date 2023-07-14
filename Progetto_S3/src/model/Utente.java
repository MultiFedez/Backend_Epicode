package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String numeroDiTessera;
	@Column(name = "name")
	private String nome;
	@Column(name = "lastname")
	private String cognome;
	@Column(name = "dateOfBirthday")
	private LocalDate dataDiNascita;
	
	
	public Utente() {
		super();
	}

	public Utente(String nome, String cognome, LocalDate dataDiNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getNumeroDiTessera() {
		return numeroDiTessera;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", numeroDiTessera=" + numeroDiTessera + "]";
	}
	
	
}
