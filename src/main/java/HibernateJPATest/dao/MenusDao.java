package HibernateJPATest.dao;

import HibernateJPATest.model.MenuEntry;
import HibernateJPATest.model.Menus;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 29.10.12
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class MenusDao {

    @PersistenceContext
    private EntityManager entityManager;

    public Menus find(Long id) {
        return entityManager.find(Menus.class, id);
    }

    public Menus getMenuByName(String name) {
        Query query = entityManager.createQuery("select p from Menus p where p.name = :menuName");
        query.setParameter("menuName", name);
        return (Menus) query.getSingleResult();
    }

    public Collection<MenuEntry> getAllMenuEntriesByMenuName(String name) {
        Query query = entityManager.createQuery("select p from Menus p where p.name = :menuName");
        query.setParameter("menuName", name);
        Menus menu = (Menus) query.getSingleResult();
        Collection<MenuEntry>  menuEntries = menu.getMenuEntries();
        return menuEntries;
    }

    @Transactional
    public Menus createNewMenu(String name) {
        Menus menu = new Menus();
        menu.setName(name);
        entityManager.persist(menu);
        return  menu;
    }

    @Transactional
    public Menus addMenu(Menus menu) {
        if (menu.getId() == null) {
            entityManager.persist(menu);
            return menu;
        } else {
            return entityManager.merge(menu);
        }
    }
}