package HibernateJPATest.model;

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
    private Long id;

    @GeneratedValue
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String name;

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Collection<MenuEntry> menuEntries;

    @ManyToMany(mappedBy = "menus", fetch = FetchType.EAGER)
    public Collection<MenuEntry> getMenuEntries() {
        return menuEntries;
    }

    public void setMenuEntries(Collection<MenuEntry> menuEntries) {
        this.menuEntries = menuEntries;
    }
}
