package OneToOne.entities;

import javax.persistence.*;

/**
 * Created by mtarasenko on 17.12.16.
 */
@Entity
public class Phone {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="phone_number")
    private String value;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
