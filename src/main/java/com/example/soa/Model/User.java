package com.example.soa.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    public String FirstName;
    public String LastName;
    public String EMBG;
    public String Username;
    public String Password;
    public String Email;
    public Date Birthday;
    public Date EmplDate;

    @ManyToOne
    public Role role;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String EMBG, String username, String password, String email, Date birthday, Date emplDate, Role role) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.EMBG = EMBG;
        Username = username;
        Password = password;
        Email = email;
        Birthday = birthday;
        EmplDate = emplDate;
        this.role = role;
    }
}
