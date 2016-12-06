//Director

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Director implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String firstname;
    private String comment;
    
    @ManyToMany(mappedBy = "directors")
    private Collection<Event> events;

    public Director() {
    }
    
    public Director(String surname, String firstname, String comment) {
        this.surname = surname;
        this.firstname = firstname;
        this.comment = comment;
    }

    public Director(Long id, String surname, String firstname, String comment) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.comment = comment;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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


    @Override
    public String toString() {
        return "entites.Director[ id=" + id + " ]";
    }
    
}
