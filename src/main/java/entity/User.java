package entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import java.sql.Date;
import java.sql.Time;

@Entity
public class User {
    private String UserId;
    private String Name;
    private String Email;
    private String Status;
    private Integer Coin;
    private Integer Balance;
    private Integer KeySilver;
    private Integer KeyGold;
    private Integer KeyDiamond;
    private Integer TotalReferral;
    private Integer Xp;
    private Integer Level;
    private String Reason;
    @JsonFormat(pattern = "YYYY-MM-DD")
    private Date CreatedDate;
    @JsonFormat(pattern = "HH:MM:SS")
    private Time CreatedTime;

    public User(String userId, String name, String email, String status, Integer coin, Integer balance, Integer keySilver, Integer keyGold, Integer keyDiamond, Integer totalReferral, Integer xp, Integer level, String reason, Date createdDate, Time createdTime) {
        UserId = userId;
        Name = name;
        Email = email;
        Status = status;
        Coin = coin;
        Balance = balance;
        KeySilver = keySilver;
        KeyGold = keyGold;
        KeyDiamond = keyDiamond;
        TotalReferral = totalReferral;
        Xp = xp;
        Level = level;
        Reason = reason;
        CreatedDate = createdDate;
        CreatedTime = createdTime;
    }

    public String getUserId() {

        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Integer getCoin() {
        return Coin;
    }

    public void setCoin(Integer coin) {
        Coin = coin;
    }

    public Integer getBalance() {
        return Balance;
    }

    public void setBalance(Integer balance) {
        Balance = balance;
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

    public Integer getTotalReferral() {
        return TotalReferral;
    }

    public void setTotalReferral(Integer totalReferral) {
        TotalReferral = totalReferral;
    }

    public Integer getXp() {
        return Xp;
    }

    public void setXp(Integer xp) {
        Xp = xp;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
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
