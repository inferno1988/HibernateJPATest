package HibernateJPATest.dao;

import HibernateJPATest.model.MainMenuEntry;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MainMenuEntryDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public MainMenuEntry find(Long id) {
		return entityManager.find(MainMenuEntry.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<MainMenuEntry> getMainMenuEntries() {
		return entityManager.createQuery("select p from MainMenuEntry p").getResultList();
	}
	
	@Transactional
	public MainMenuEntry save(MainMenuEntry mainMenuEntry) {
		if (mainMenuEntry.getId() == null) {
			entityManager.persist(mainMenuEntry);
			return mainMenuEntry;
		} else {
			return entityManager.merge(mainMenuEntry);
		}		
	}	
	
}
