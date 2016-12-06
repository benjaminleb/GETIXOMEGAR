//SubGenre

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SubGenre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String comment;
    
    @OneToMany(mappedBy = "subGenre")
    private Collection<Event> events;
    @ManyToOne
    private Genre genre;

    public SubGenre() {
    }

    public SubGenre(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public SubGenre(Long id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }
    
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    

    @Override
    public String toString() {
        return "entites.SubGenre[ id=" + id + " ]";
    }
    
}
