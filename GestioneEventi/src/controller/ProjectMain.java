package controller;

import java.time.LocalDate;

import enumeration.TipoEvento;
import model.Evento;
import model.EventoDAO;

public class ProjectMain {

	public static void main(String[] args) {
		Evento e = new Evento("Calici di stelle",LocalDate.of(2023,11,21),"bere vino",TipoEvento.PUBBLICO,100);
		
		try {
			EventoDAO eventoDao = new EventoDAO();
			EventoDAO.save(e);
		}
	
	}
	

}
