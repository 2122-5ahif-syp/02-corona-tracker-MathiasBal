package at.htl.guestregister.entity;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.Instant;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long id;

    @JsonbProperty("first_name")
    @Column(name = "f_name")
    private String firsttName;

    @JsonbProperty("last_name")
    @Column(name = "l_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    private Instant timestamp;

    public Customer(String firsttName, String lastName, String email, String telephone, Instant timestamp) {
        this.firsttName = firsttName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.timestamp = timestamp;
    }

    public Customer() {
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getFirsttName() {
        return firsttName;
    }

    public void setFirsttName(String firsttName) {
        this.firsttName = firsttName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
