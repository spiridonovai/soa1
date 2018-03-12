package com.example.soa.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "timesheet")
public class TimeSheet extends BaseEntity{
    public long id;
    public User user;
    public Date date;
    public float hours;
    public TimeSheet() {
    }

    public TimeSheet(long id, User username, Date date, float hours) {
        this.id = id;
        this.user = username;
        this.date = date;
        this.hours = hours;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    @Column(name = "user_id",nullable = false,unique = true)
    public User getUsername() {
        return user;
    }

    public void setUsername(User username) {
        this.user = username;
    }
    @Column(name="date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Column(name = "hours",nullable = false)
    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
}
