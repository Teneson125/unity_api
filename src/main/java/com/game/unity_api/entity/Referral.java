package com.game.unity_api.entity;

import javax.persistence.*;

@Entity
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(unique = true)
    private String RefId;
    private Double Amount;
    private Integer Coin;
    private Integer KeySilver;
    private Integer KeyGold;
    private Integer KeyDiamond;
    private String Status;

    public Referral(String refId, Double amount, Integer coin, Integer keySilver, Integer keyGold, Integer keyDiamond, String status) {
        RefId = refId;
        Amount = amount;
        Coin = coin;
        KeySilver = keySilver;
        KeyGold = keyGold;
        KeyDiamond = keyDiamond;
        Status = status;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRefId() {
        return RefId;
    }

    public void setRefId(String refId) {
        RefId = refId;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }

    public Integer getCoin() {
        return Coin;
    }

    public void setCoin(Integer coin) {
        Coin = coin;
    }

    public Integer getKeySilver() {
        return KeySilver;
    }

    public void setKeySilver(Integer keySilver) {
        KeySilver = keySilver;
    }

    public Integer getKeyGold() {
        return KeyGold;
    }

    public void setKeyGold(Integer keyGold) {
        KeyGold = keyGold;
    }

    public Integer getKeyDiamond() {
        return KeyDiamond;
    }

    public void setKeyDiamond(Integer keyDiamond) {
        KeyDiamond = keyDiamond;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
