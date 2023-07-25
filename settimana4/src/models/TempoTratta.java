package models;

import javax.persistence.*;
import java.time.LocalTime; 
@Entity

public class TempoTratta {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long id;
	private LocalTime tempoEffettivo;
	
	public TempoTratta() {
		super();
	}

	public TempoTratta(LocalTime tempoEffettivo) {
		super();
		this.tempoEffettivo = tempoEffettivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalTime getTempoEffettivo() {
		return tempoEffettivo;
	}

	public void setTempoEffettivo(LocalTime tempoEffettivo) {
		this.tempoEffettivo = tempoEffettivo;
	}
	
	
}
