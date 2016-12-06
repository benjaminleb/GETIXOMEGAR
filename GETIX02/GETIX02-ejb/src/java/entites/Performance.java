//Performance

package entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Performance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String area;
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePerf;
    private String comment;
    
    @ManyToOne
    private Event event;
    @ManyToOne
    private Tax tax;
    @ManyToOne
    private Venue venue;
    @OneToMany(mappedBy = "performance")
    private Collection<Ticket> tickets;
    
    
    
    public Performance() {
    }

    public Performance(String area, Date date, String comment) {
        this.area = area;
        this.datePerf = date;
        this.comment = comment;
    }
    public Performance(Long id, String area, Date date, String comment) {
        this.id = id;
        this.area = area;
        this.datePerf = date;
        this.comment = comment;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getDate() {
        return datePerf;
    }

    public void setDate(Date date) {
        this.datePerf = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDatePerf() {
        return datePerf;
    }

    public void setDatePerf(Date datePerf) {
        this.datePerf = datePerf;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }
    
    
    @Override
    public String toString() {
        return "entites.Performance[ id=" + id + " ]";
    }
    
}
