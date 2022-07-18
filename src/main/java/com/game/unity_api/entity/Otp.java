package com.game.unity_api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Otp {

    @Id
    private String email;
    private String tpo;
    private String createdDate;
    private String createdTime;

    public Otp(String email, String tpo, String createdDate, String createdTime) {
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }
}
