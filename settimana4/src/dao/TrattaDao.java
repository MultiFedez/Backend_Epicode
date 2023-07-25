package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import models.Tratta;
import utils.JpaUtil;

public class TrattaDao {
    
	public static void save (Tratta t) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(t);
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
}
