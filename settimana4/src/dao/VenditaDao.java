package dao;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import models.Venditore;
import utils.JpaUtil;

public class VenditaDao {
	
	public static void save ( Venditore v) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(v);
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
	 
	public static Venditore getVenditore( Integer id){
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		Venditore v = null;
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                v = em.find(Venditore.class, id);
                transaction.commit();
		        
                
		    }catch (Exception ex) {
	            
		    	em.getTransaction().rollback();
		    	System.out.println(" Errore " + ex);
		    	throw ex;
		    }
		    finally {
		    	em.close();
		    }
		
		return v;	
	}

	public List<Venditore> findVenditeMax(){
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Venditore.findVenditeMax", Venditore.class);
        return query.getResultList();
    }
}
