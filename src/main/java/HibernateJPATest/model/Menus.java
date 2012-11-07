package HibernateJPATest.model;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 29.10.12
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Menus {

    @GeneratedValue
    @Id
    private Long id;

    @ManyToMany(mappedBy = "menus", fetch = FetchType.LAZY)
    private Collection<MenuEntry> menuEntries;

    @Basic
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<MenuEntry> getMenuEntries() {
        return menuEntries;
    }

    public void setMenuEntries(Collection<MenuEntry> menuEntries) {
        this.menuEntries = menuEntries;
    }
}
