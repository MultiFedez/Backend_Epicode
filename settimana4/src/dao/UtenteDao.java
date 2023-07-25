package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import models.Tessera;
import models.Utente;
import utils.JpaUtil;

public class UtenteDao {
      
	public static void save (Utente u) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(u);
                transaction.commit();
			
		    }catch (Exception ex) {
	            
		    	em.getTransaction().rollback();
		    	System.out.println(" Errore " + ex);
		    	throw ex;
		    }
		    finally {
		    	em.close();
		    }
      }
	
	public static Utente getUtente( Integer id){
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		Utente u = null;
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
               u = em.find(Utente.class, id);
                transaction.commit();
		        
                
		    }catch (Exception ex) {
	            
		    	em.getTransaction().rollback();
		    	System.out.println(" Errore " + ex);
		    	throw ex;
		    }
		    finally {
		    	em.close();
		    }
		return u;
	}
	
	public List<Utente> findAll() {
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        Query query =  em.createNamedQuery("Utente.findAll", Utente.class);
        return query.getResultList();

    }
}
