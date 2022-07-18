package com.game.unity_api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Otp {

    @Id
    private String email;
    private String otp;
    private String createdDate;
    private String createdTime;

    public Otp(){
        
    }
    public Otp(String email, String otp, String createdDate, String createdTime) {
        this.email = email;
        this.otp = otp;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
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
