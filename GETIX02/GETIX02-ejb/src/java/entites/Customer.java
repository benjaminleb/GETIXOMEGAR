//Customer

package entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String surname;
    private String firstname;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    private String email;
    private String password;
    
    @OneToMany(mappedBy = "customer")
    private Collection<Order> orders;
    @OneToMany(mappedBy = "deliveryCustomer")
    private Collection<Address> addresses;
    @OneToMany(mappedBy = "billingCustomer")
    private Collection<Address> billingAddresses;

    public Customer() {
    }

    public Customer(String surname, String firstname, Date birthDate, String email, String password) {
        this.surname = surname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
    }

    public Customer(Long id, String surname, String firstname, Date birthDate, String email, String password) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }

    public Collection<Address> getBillingAddresses() {
        return billingAddresses;
    }

    public void setBillingAddresses(Collection<Address> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    @Override
    public String toString() {
        return "entites.Customer[ id=" + id + " ]";
    }
    
}
