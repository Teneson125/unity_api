package com.game.unity_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Otp {

    @Id
    private String Email;
    private String Otp;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date CreatedDate;
    @JsonFormat(pattern = "HH:MM:SS")
    private Time CreatedTime;

    public Otp(String email, String otp, Date createdDate, Time createdTime) {
        Email = email;
        Otp = otp;
        CreatedDate = createdDate;
        CreatedTime = createdTime;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getOtp() {
        return Otp;
    }

    public void setOtp(String otp) {
        Otp = otp;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Time getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Time createdTime) {
        CreatedTime = createdTime;
    }
}
