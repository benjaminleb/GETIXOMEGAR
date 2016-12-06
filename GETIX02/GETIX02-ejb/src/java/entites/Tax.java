//Tax

package entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tax implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float valueTax;
   
    @OneToMany(mappedBy = "tax")
    private Collection<Performance> performance;

    public Tax() {
    }

    public Tax(String name, float value) {
        this.name = name;
        this.valueTax = value;
    }

    public Tax(Long id, String name, float value) {
        this.id = id;
        this.name = name;
        this.valueTax = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return valueTax;
    }

    public void setValue(float value) {
        this.valueTax = value;
    }
  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "entites.Tax[ id=" + id + " ]";
    }
    
}
