//Order

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
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;
    private String refOrder;
    private String comment;
    private float totalPriceIT;
    
    @OneToMany(mappedBy = "order")
    private Collection<Ticket> tickets;
    @ManyToOne
    private DeliveryOption deliveryOption;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Address address;
    @ManyToOne
    private Address billingAddress;

    public Order() {
    }

    public Order(Date date, String ref, String comment, float totalPriceIT) {
        this.dateOrder = date;
        this.refOrder = ref;
        this.comment = comment;
        this.totalPriceIT = totalPriceIT;
    }

    public Order(Long id, Date date, String ref, String comment, float totalPriceIT) {
        this.id = id;
        this.dateOrder = date;
        this.refOrder = ref;
        this.comment = comment;
        this.totalPriceIT = totalPriceIT;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return dateOrder;
    }

    public void setDate(Date date) {
        this.dateOrder = date;
    }

    public String getRef() {
        return refOrder;
    }

    public void setRef(String ref) {
        this.refOrder = ref;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getTotalPriceIT() {
        return totalPriceIT;
    }

    public void setTotalPriceIT(float totalPriceIT) {
        this.totalPriceIT = totalPriceIT;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public DeliveryOption getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(DeliveryOption deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

   

    @Override
    public String toString() {
        return "entites.Order[ id=" + id + " ]";
    }
    
}
