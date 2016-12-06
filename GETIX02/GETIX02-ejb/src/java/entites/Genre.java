//Genre

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String comment;
    
    @OneToMany(mappedBy = "genre")
    private Collection<SubGenre> subGenres;

    public Genre() {
    }

    public Genre(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public Genre(Long id, String name, String comment) {
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

    public Collection<SubGenre> getSubGenres() {
        return subGenres;
    }

    public void setSubGenres(Collection<SubGenre> subGenres) {
        this.subGenres = subGenres;
    }

    @Override
    public String toString() {
        return "entites.Genre[ id=" + id + " ]";
    }
    
}
