package com.game.unity_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Otp {

    @Id
    private String email;
    private String tpo;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date createdDate;
    @JsonFormat(pattern = "HH:MM:SS")
    private Time createdTime;

    public Otp(String email, String tpo, Date createdDate, Time createdTime) {
        this.email = email;
        this.tpo = tpo;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTpo() {
        return tpo;
    }

    public void setTpo(String tpo) {
        this.tpo = tpo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Time getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Time createdTime) {
        this.createdTime = createdTime;
    }
}
