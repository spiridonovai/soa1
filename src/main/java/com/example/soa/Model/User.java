package com.example.soa.Model;

import java.util.Date;

public class User {
    public int id;
    public String FirstName;
    public String LastName;
    public String EMBG;
    public String Username;
    public String Password;
    public String Email;
    public Date Birthday;
    public Date EmplDate;
    public Role role;

    public User() {

    }

    public User(int id, String firstName, String lastName, String EMBG, String username, String password, String email, Date birthday, Date emplDate, Role role) {
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
