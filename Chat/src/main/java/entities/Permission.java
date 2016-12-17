package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mtarasenko on 17.12.16.
 */
@Entity(name="role_permissions")
public class Permission {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Role> roles;

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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
