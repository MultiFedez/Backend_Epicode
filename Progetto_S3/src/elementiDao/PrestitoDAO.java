package elementiDao;

import javax.persistence.EntityManager;

import model.CatalogoBibliotecario;
import model.Prestito;
import util.JpaUtil;

public class PrestitoDAO {

	
	public void save(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		
		try {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println(p);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			em.close();
		}
	}
}
