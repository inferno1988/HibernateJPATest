package HibernateJPATest.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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


}
