package elementiDao;

import javax.persistence.EntityManager;

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
	
	public void delete(CatalogoBibliotecario cb) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.remove(cb);
		em.getTransaction().commit();
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
	public void refresh(CatalogoBibliotecario cb) {
		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.refresh(cb);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
	
}
