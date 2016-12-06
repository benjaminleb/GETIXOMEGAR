//Category

package entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String comment;
    private float priceEt;
    private String priceType;

    @ManyToMany(mappedBy = "Categories")
    private List<Seat> seats;
    

    public Category() {
    }

    public Category(String name, String comment, float priceEt, String priceType) {
        this.name = name;
        this.comment = comment;
        this.priceEt = priceEt;
        this.priceType = priceType;
    }

    public Category(Long id, String name, String comment, float priceEt, String priceType) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.priceEt = priceEt;
        this.priceType = priceType;
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

    public float getPriceEt() {
        return priceEt;
    }

    public void setPriceEt(float priceEt) {
        this.priceEt = priceEt;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "entites.Category[ id=" + id + " ]";
    }
    
}
