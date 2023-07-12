package model;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class EventoDAO {
	
	public static void save(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public Evento getById(long id) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Evento e = null;
		try {
		em.getTransaction().begin();
		e = em.find(Evento.class, id);
		em.getTransaction().commit();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
		return e;
	}
	
	public void delete(Evento e) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void refresh(Evento e) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.refresh(e);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
}
