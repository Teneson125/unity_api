package com.game.unity_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Email;
    private Integer Coin;
    private String Reason;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date Date;
    @JsonFormat(pattern = "HH:MM:SS")
    private Time Time;

    public Coin(String email, Integer coin, String reason, java.util.Date date, java.sql.Time time) {
        Email = email;
        Coin = coin;
        Reason = reason;
        Date = date;
        Time = time;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getCoin() {
        return Coin;
    }

    public void setCoin(Integer coin) {
        Coin = coin;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public java.sql.Time getTime() {
        return Time;
    }

    public void setTime(java.sql.Time time) {
        Time = time;
    }
}
