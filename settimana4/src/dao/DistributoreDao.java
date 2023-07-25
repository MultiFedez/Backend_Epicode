package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import enums.Stato;
import models.Distributore;
import utils.JpaUtil;

public class DistributoreDao {
	public static void save ( Distributore d) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(d);
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
	
	public List<Distributore> distributoriStato(Stato stato){
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Distributore.distributoriStato", Distributore.class);
        query.setParameter("stato", stato);
        return query.getResultList();
    }
}
