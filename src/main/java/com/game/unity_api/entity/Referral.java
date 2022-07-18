package com.game.unity_api.entity;

import javax.persistence.*;

@Entity
public class Referral {
    @Id
    private String refId;
    private Double amount;
    private Integer coin;
    private Integer keySilver;
    private Integer keyGold;
    private Integer keyDiamond;
    private String status;

    public  Referral(){

    }
    public Referral(String refId, Double amount, Integer coin, Integer keySilver, Integer keyGold, Integer keyDiamond, String status) {
        this.refId = refId;
        this.amount = amount;
        this.coin = coin;
        this.keySilver = keySilver;
        this.keyGold = keyGold;
        this.keyDiamond = keyDiamond;
        this.status = status;
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
}
