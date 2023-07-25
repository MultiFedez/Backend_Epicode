package models;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tratte")
public class Tratta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtratta;
	
	@Column(nullable = false)
	private String partenza;
	
	@Column(nullable = false)
	private String capolinea;
	
	@Column(nullable = false)
	private LocalTime durata;

	public Tratta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tratta(String partenza, String capolinea, LocalTime durata) {
		super();
		this.partenza = partenza;
		this.capolinea = capolinea;
		this.durata = durata;
	}

	public Integer getIdtratta() {
		return idtratta;
	}

	public void setIdtratta(Integer idtratta) {
		this.idtratta = idtratta;
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public String getCapolinea() {
		return capolinea;
	}

	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}

	public LocalTime getDurata() {
		return durata;
	}

	public void setDurata(LocalTime durata) {
		this.durata = durata;
	}

	@Override
	public String toString() {
		return "Tratta [idtratta=" + idtratta + ", partenza=" + partenza + ", capolinea=" + capolinea + ", durata="
				+ durata + "]";
	}
	
	
	

}
