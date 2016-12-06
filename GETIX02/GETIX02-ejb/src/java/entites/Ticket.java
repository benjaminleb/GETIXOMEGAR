//Ticket

package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String refTicket;
    private String type;
    private String comment;
    private float priceIT;
    private float taxRate;
    
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Performance performance;
    @ManyToOne
    private Order order;

    public Ticket() {
    }

    public Ticket(String ref, String type, String comment, float priceIT, float taxRate) {
        this.refTicket = ref;
        this.type = type;
        this.comment = comment;
        this.priceIT = priceIT;
        this.taxRate = taxRate;
    }

    public Ticket(Long id, String ref, String type, String comment, float priceIT, float taxRate) {
        this.id = id;
        this.refTicket = ref;
        this.type = type;
        this.comment = comment;
        this.priceIT = priceIT;
        this.taxRate = taxRate;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return refTicket;
    }

    public void setRef(String ref) {
        this.refTicket = ref;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getPriceIT() {
        return priceIT;
    }

    public void setPriceIT(float priceIT) {
        this.priceIT = priceIT;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public String getRefTicket() {
        return refTicket;
    }

    public void setRefTicket(String refTicket) {
        this.refTicket = refTicket;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    @Override
    public String toString() {
        return "entites.Ticket[ id=" + id + " ]";
    }
    
}
