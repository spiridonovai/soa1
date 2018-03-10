package com.example.soa.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Role extends BaseEntity {
    public int id;
    public String role_name;

    public Role() {

    }

    public Role(String role_name) {
        this.role_name = role_name;
    }
}
