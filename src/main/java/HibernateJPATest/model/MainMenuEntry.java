package HibernateJPATest.model;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: atom
 * Date: 26.10.12
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class MainMenuEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String caption;

    @Column
    private String href;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "MainMenuEntry{" +
                "id=" + id +
                ", caption='" + caption + '\'' +
                ", href='" + href + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MainMenuEntry mainMenuEntry = (MainMenuEntry) o;

        if (!caption.equals(mainMenuEntry.caption)) return false;
        if (!href.equals(mainMenuEntry.href)) return false;
        if (!id.equals(mainMenuEntry.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + caption.hashCode();
        result = 31 * result + href.hashCode();
        return result;
    }
}