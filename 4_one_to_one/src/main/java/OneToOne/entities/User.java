package OneToOne.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="users_with_phones")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="phone_id")
    private Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public User(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
