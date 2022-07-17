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
}
