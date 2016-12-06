//DeliveryOption

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DeliveryOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private float price;
    @OneToMany(mappedBy = "deliveryOption")
    private Collection<Order> orders;
   

    public DeliveryOption() {
    }

    public DeliveryOption(String type, float price) {
        this.type = type;
        this.price = price;
    }

    public DeliveryOption(Long id, String type, float price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "entites.DeliveryOption[ id=" + id + " ]";
    }
    
}
