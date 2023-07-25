package dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import models.Abbonamento;
import models.Viaggi;
import utils.JpaUtil;

public class AbbonamentoDao {
	
	public static void save ( Abbonamento ab) {
		EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
		EntityManager em = emf.createEntityManager();
		
		try{
			    EntityTransaction transaction = em.getTransaction();	
                transaction.begin();
                em.persist(ab);
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
	
	public List<Viaggi> getActiveByCode( Integer id) {
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        Query query = em.createNamedQuery("FindForRivenditore");
        query.setParameter("idRivenditore", id);
        return query.getResultList();
    }
}
