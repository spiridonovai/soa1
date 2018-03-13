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

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEMBG() {
        return EMBG;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public Date getEmplDate() {
        return EmplDate;
    }

    public Role getRole() {
        return role;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEMBG(String EMBG) {
        this.EMBG = EMBG;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public void setEmplDate(Date emplDate) {
        EmplDate = emplDate;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
