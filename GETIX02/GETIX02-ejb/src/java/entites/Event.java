//Event

package entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    private String comment;
    
    @ManyToOne
    private SubGenre subGenre;
    
    @ManyToMany
    private Collection<Artist> artists;
    
    @ManyToMany
    private Collection<Director> directors;
    
    @OneToMany(mappedBy = "event")
    private Collection<Performance> performances;
   
   

    public Event() {
    }

    public Event(String name, Date startDate, Date endDate, String comment) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
    }

    public Event(Long id, String name, Date startDate, Date endDate, String comment) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubGenre getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(SubGenre subGenre) {
        this.subGenre = subGenre;
    }

    public Collection<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Collection<Artist> artists) {
        this.artists = artists;
    }

    public Collection<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Collection<Director> directors) {
        this.directors = directors;
    }

    public Collection<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(Collection<Performance> performances) {
        this.performances = performances;
    }
    
    @Override
    public String toString() {
        return "entites.Event[ id=" + id + " ]";
    }
    
}
