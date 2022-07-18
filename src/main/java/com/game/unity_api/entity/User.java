package com.game.unity_api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class User {
    @Column(unique = true)
    private String userId;
    private String name;
    @Id
    @Column(unique = true)
    private String email;
    private String status;
    private Integer coin;
    private Double balance;
    private Integer keySilver;
    private Integer keyGold;
    private Integer keyDiamond;
    private Integer totalReferral;
    private Integer xp;
    private Integer level;
    private String reason;
    private String refId;
    private String refStatus;
    private String createdDate;
    private String createdTime;

    public User(){

    }
    public User(String userId, String name, String email, String status, Integer coin, Double balance, Integer keySilver, Integer keyGold, Integer keyDiamond, Integer totalReferral, Integer xp, Integer level, String reason, String refId, String refStatus, String createdDate, String createdTime) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.status = status;
        this.coin = coin;
        this.balance = balance;
        this.keySilver = keySilver;
        this.keyGold = keyGold;
        this.keyDiamond = keyDiamond;
        this.totalReferral = totalReferral;
        this.xp = xp;
        this.level = level;
        this.reason = reason;
        this.refId = refId;
        this.refStatus = refStatus;
        this.createdDate = createdDate;
        this.createdTime = createdTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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

    public Integer getTotalReferral() {
        return totalReferral;
    }

    public void setTotalReferral(Integer totalReferral) {
        this.totalReferral = totalReferral;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRefStatus() {
        return refStatus;
    }

    public void setRefStatus(String refStatus) {
        this.refStatus = refStatus;
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
