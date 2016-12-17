package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mtarasenko on 17.12.16.
 */

@Entity(name="role")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="role_name")
    private String roleName;

    @OneToMany(orphanRemoval = true, mappedBy = "role", cascade = CascadeType.ALL)
    private List<User> users;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Permission> permissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
