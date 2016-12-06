//Seat

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rank;
    private String seatNum;
    
    @ManyToOne
    private Venue venue;
    @ManyToMany
    private Collection<Category> Categories;
    @OneToMany(mappedBy = "seat")
    private Collection<Ticket> tickets;
    
    public Seat() {
    }

    public Seat(String rank, String seatNum) {
        this.rank = rank;
        this.seatNum = seatNum;
    }
    
    public Seat(Long id, String rank, String seatNum) {
        this.id = id;
        this.rank = rank;
        this.seatNum = seatNum;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Collection<Category> getCategories() {
        return Categories;
    }

    public void setCategories(Collection<Category> Categories) {
        this.Categories = Categories;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "entites.Seat[ id=" + id + " ]";
    }
    
}
