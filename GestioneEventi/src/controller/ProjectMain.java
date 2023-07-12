package controller;

import java.time.LocalDate;

import enumeration.TipoEvento;
import model.Evento;
import model.EventoDAO;

public class ProjectMain {

	public static void main(String[] args) {
		Evento e = new Evento("Calici di stelle",LocalDate.of(2023,11,21),"bere vino",TipoEvento.PUBBLICO,100);
		Evento e2 = new Evento("ferragosto",LocalDate.of(2023,8,15), "festa in spiaggia",TipoEvento.PUBBLICO,800);
		
	
		EventoDAO eventoDao = new EventoDAO();
		eventoDao.save(e);
		eventoDao.getById(2);
		eventoDao.save(e2);
		eventoDao.delete(e2);
		eventoDao.refresh(e2);
		
	}
}
