//Venue

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
public class Venue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int capacity;
    private String comment;
    
    @OneToMany(mappedBy = "venue")
    private Collection<Performance> performances;
    @OneToMany(mappedBy = "venue")
    private Collection<Seat> seats;
    @ManyToOne
    private Address address;
    
    public Venue() {
    }

    public Venue(String name, int capacity, String comment) {
        this.name = name;
        this.capacity = capacity;
        this.comment = comment;
    }
    
    public Venue(Long id, String name, int capacity, String comment) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    public Collection<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(Collection<Performance> performances) {
        this.performances = performances;
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Collection<Seat> seats) {
        this.seats = seats;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "entites.Venue[ id=" + id + " ]";
    }
    
}
