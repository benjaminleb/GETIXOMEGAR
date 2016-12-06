//Address

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private String streetNum;
    private String streetType;
    private String streetName;
    private String zipcode;
    private String country;
    
    @OneToMany(mappedBy = "address")
    private Collection<Order> deliveryOrders;
    @OneToMany(mappedBy = "address")
    private Collection<Order> billingOrders; 
    @ManyToOne
    private Customer deliveryCustomer;
    @ManyToOne
    private Customer billingCustomer;
    @OneToMany(mappedBy = "address")
    private Collection<Venue> venues;
   

    public Address() {
    }

    public Address(String streetNum, String streetType, String streetName, String zipcode, String country) {
        this.streetNum = streetNum;
        this.streetType = streetType;
        this.streetName = streetName;
        this.zipcode = zipcode;
        this.country = country;
    }

    public Address(Long id, String streetNum, String streetType, String streetName, String zipcode, String country) {
        this.id = id;
        this.streetNum = streetNum;
        this.streetType = streetType;
        this.streetName = streetName;
        this.zipcode = zipcode;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Collection<Order> getDeliveryOrders() {
        return deliveryOrders;
    }

    public void setDeliveryOrders(Collection<Order> deliveryOrders) {
        this.deliveryOrders = deliveryOrders;
    }

    public Collection<Order> getBillingOrders() {
        return billingOrders;
    }

    public void setBillingOrders(Collection<Order> billingOrders) {
        this.billingOrders = billingOrders;
    }

    public Customer getDeliveryCustomer() {
        return deliveryCustomer;
    }

    public void setDeliveryCustomer(Customer deliveryCustomer) {
        this.deliveryCustomer = deliveryCustomer;
    }

    public Customer getBillingCustomer() {
        return billingCustomer;
    }

    public void setBillingCustomer(Customer billingCustomer) {
        this.billingCustomer = billingCustomer;
    }

    public Collection<Venue> getVenues() {
        return venues;
    }

    public void setVenues(Collection<Venue> venues) {
        this.venues = venues;
    }
   
    @Override
    public String toString() {
        return "entites.Address[ id=" /*+ id + */+" ]";
    }
}
