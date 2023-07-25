package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import models.Mezzo;
import models.Venditore;
import utils.JpaUtil;

public class MezzoDao{
	
	public static void save ( Mezzo m) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
			try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(m);
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

	public static Mezzo getMezzo( Integer id){
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		Mezzo m = null;
			try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                m = em.find(Mezzo.class, id);
                transaction.commit();
		            
		    }catch (Exception ex) {
		    	em.getTransaction().rollback();
		    	System.out.println(" Errore " + ex);
		    	throw ex;
		    }
		    finally {
		    	em.close();
		    }
		
		return m;
	}
}
