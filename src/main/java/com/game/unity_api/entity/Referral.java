package com.game.unity_api.entity;

import javax.persistence.*;

@Entity
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String refId;
    private Double amount;
    private Integer coin;
    private Integer keySilver;
    private Integer keyGold;
    private Integer keyDiamond;
    private String status;
    private String date;
    private String time;

    public Referral(){

    }

    public Referral(String refId, Double amount, Integer coin, Integer keySilver, Integer keyGold, Integer keyDiamond, String status, String date, String time) {
        this.refId = refId;
        this.amount = amount;
        this.coin = coin;
        this.keySilver = keySilver;
        this.keyGold = keyGold;
        this.keyDiamond = keyDiamond;
        this.status = status;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getKeySilver() {
        return keySilver;
    }

    public void setKeySilver(Integer keySilver) {
        this.keySilver = keySilver;
    }

    public Integer getKeyGold() {
        return keyGold;
    }

    public void setKeyGold(Integer keyGold) {
        this.keyGold = keyGold;
    }

    public Integer getKeyDiamond() {
        return keyDiamond;
    }

    public void setKeyDiamond(Integer keyDiamond) {
        this.keyDiamond = keyDiamond;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
