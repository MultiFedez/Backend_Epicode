package models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "punti_vendita")
@DiscriminatorColumn(name = "tipologia")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery( name = "Venditore.findVenditeMax" , query = "SELECT a FROM Venditore a WHERE a.numerovendite > 2000")
public class Venditore {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idvendita;
		private String indirizzo;
	    private Integer numerovendite;
		
	    
		public Venditore() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Venditore(String indirizzo, Integer numerovendite) {
			super();
			this.indirizzo = indirizzo;
			this.numerovendite = numerovendite;
		}


		public Integer getIdvendita() {
			return idvendita;
		}

		public void setIdvendita(Integer idvendita) {
			this.idvendita = idvendita;
		}

		public String getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}

		public Integer getNumerovendite() {
			return numerovendite;
		}

		public void setNumerovendite(Integer numerovendite) {
			this.numerovendite = numerovendite;
		}


		@Override
		public String toString() {
			return "Venditore [idvendita=" + idvendita + ", indirizzo=" + indirizzo + ", numerovendite=" + numerovendite
					+ "]";
		}	    

}
