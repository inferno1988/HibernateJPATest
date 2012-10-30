package HibernateJPATest.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 29.10.12
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class News {

    @GeneratedValue
    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private User user;

    @Basic
    private String theme;

    @Lob
    @Basic
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
