package HibernateJPATest.dao;

import HibernateJPATest.model.MenuEntry;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MenuEntryDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public MenuEntry find(Long id) {
		return entityManager.find(MenuEntry.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<MenuEntry> getMainMenuEntries() {
		return entityManager.createQuery("select p from MenuEntry p").getResultList();
	}
	
	@Transactional
	public MenuEntry save(MenuEntry menuEntry) {
		if (menuEntry.getId() == null) {
			entityManager.persist(menuEntry);
			return menuEntry;
		} else {
			return entityManager.merge(menuEntry);
		}		
	}	
}
