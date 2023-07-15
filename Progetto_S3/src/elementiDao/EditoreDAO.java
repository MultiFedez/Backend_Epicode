package elementiDao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.CatalogoBibliotecario;
import util.JpaUtil;



public class EditoreDAO {

	public void save(CatalogoBibliotecario cb) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.persist(cb);
		em.getTransaction().commit();
		System.out.println(cb);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public CatalogoBibliotecario getById(long id) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		CatalogoBibliotecario cb = null;
		try {
		em.getTransaction().begin();
		cb = em.find(CatalogoBibliotecario.class, id);
		em.getTransaction().commit();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
		return cb;
	}
	
	public void delete(long id) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.remove(em.find(CatalogoBibliotecario.class, id));
		em.getTransaction().commit();
		System.out.println("Elemento eliminato correttamente");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void refresh(long id) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.refresh(em.find(CatalogoBibliotecario.class, id));
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void searchForYear(int y) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query = em.createNamedQuery("searchForYear");
			query.setParameter("year",y);
			List<CatalogoBibliotecario> resultList = query.getResultList();
			resultList.forEach(c -> System.out.println(c.toString()));
		}finally {
			em.close();
		}
	}
	
	public void searchForAuthor(String a) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query = em.createNamedQuery("searchForAuthor");
			query.setParameter("author",a);
			List<CatalogoBibliotecario> resultList = query.getResultList();
			resultList.forEach(c -> System.out.println(c.toString()));
		}finally {
			em.close();
		}
	}
	
	public void searchForTitle(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query = em.createNamedQuery("searchForTitle");
			query.setParameter("title",s);
			List<CatalogoBibliotecario> resultList = query.getResultList();
			resultList.forEach(c -> System.out.println(c.toString()));
		}finally {
			em.close();
		}
	}
	
		
}
