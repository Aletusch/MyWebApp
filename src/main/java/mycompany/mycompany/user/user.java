package mycompany.mycompany.user;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(length = 15, nullable = false)
    private String passwort;

    @Column(length = 45, nullable = false, name = "first_name")
    private String firstname;

    @Column(length = 45, nullable = false, name = "last_name")
    private String lasstname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasstname() {
        return lasstname;
    }

    public void setLasstname(String lasstname) {
        this.lasstname = lasstname;
    }
}
